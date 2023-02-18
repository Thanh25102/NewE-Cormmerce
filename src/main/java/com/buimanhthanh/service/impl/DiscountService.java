package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.DiscountMapper;
import com.buimanhthanh.model.DiscountDTO;
import com.buimanhthanh.repository.DiscountRepo;
import com.buimanhthanh.service.IDiscountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountService implements IDiscountService {
    private final DiscountRepo discountRepo;
    private final DiscountMapper discountMapper;

    public DiscountService(DiscountRepo discountRepo, DiscountMapper discountMapper) {
        this.discountRepo = discountRepo;
        this.discountMapper = discountMapper;
    }

    @Override
    public List<DiscountDTO> findAll() {
        return discountRepo.findAll()
                .stream().map(discountMapper).collect(Collectors.toList());
    }
}
