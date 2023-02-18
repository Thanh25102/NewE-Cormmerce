package com.buimanhthanh.repository;

import com.buimanhthanh.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {
    @Query("from Account a where a.username = ?1")
    Optional<Account> findByUsername(String username);

    @Query("from Account a where a.email = ?1")
    Optional<Account> findByEmail(String email);
    @Query("from Account a where a.username = ?1 and a.email = ?2")
    Optional<Account> findByUsernameAndEmail(String username,String email);
}
