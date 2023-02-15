package com.buimanhthanh.repository;

import com.buimanhthanh.entity.DiscountCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountCodeRepo extends JpaRepository<DiscountCode, Integer> {
}
