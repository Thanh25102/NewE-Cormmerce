package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.DiscountCodeMapper;
import com.buimanhthanh.model.DiscountCodeDTO;
import com.buimanhthanh.repository.DiscountCodeRepo;
import com.buimanhthanh.service.IDiscountCodeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountCodeService implements IDiscountCodeService {
    private final DiscountCodeRepo discountCodeRepo;
    private final DiscountCodeMapper discountCodeMapper;

    public DiscountCodeService(DiscountCodeRepo discountCodeRepo, DiscountCodeMapper discountCodeMapper) {
        this.discountCodeRepo = discountCodeRepo;
        this.discountCodeMapper = discountCodeMapper;
    }

    @Override
    public List<DiscountCodeDTO> findAll() {
        return discountCodeRepo.findAll()
                .stream().map(discountCodeMapper)
                .collect(Collectors.toList());
    }
}
