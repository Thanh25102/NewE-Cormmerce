package com.buimanhthanh.repo;

import com.buimanhthanh.entity.Account;
import com.buimanhthanh.repository.AccountRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AccountRepoTest {
    @Autowired private AccountRepo accountRepo;
    @Test
    @Rollback()
    public void testFindByUsername(){
        String usernameNull = "testuser";
        String usernameNotNull = "Test123";
//        Optional<Account> accountNull = accountRepo.findByUsername(usernameNull);
        Optional<Account> accountNotNull = accountRepo.findByUsername(usernameNotNull);
//        accountNull.ifPresent(System.out::println);
        accountNotNull.ifPresent(System.out::println);
        assertNotNull(accountNotNull.get());
//        assertNull(accountNull.get());
    }
}
