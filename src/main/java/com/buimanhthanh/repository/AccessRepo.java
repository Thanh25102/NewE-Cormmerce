package com.buimanhthanh.repository;

import com.buimanhthanh.entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessRepo extends JpaRepository<Access, Integer> {
}
