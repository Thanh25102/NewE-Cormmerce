package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.DiscountCode;
import com.buimanhthanh.model.DiscountCodeDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DiscountCodeMapperEntity implements Function<DiscountCodeDTO, DiscountCode> {
    @Override
    public DiscountCode apply(DiscountCodeDTO discountCodeDTO) {
        return new DiscountCode(
                discountCodeDTO.id(), discountCodeDTO.code(), discountCodeDTO.salePercent(), discountCodeDTO.saleMoney(), discountCodeDTO.startDay(),
                discountCodeDTO.endDay(), discountCodeDTO.maxDiscount(), discountCodeDTO.description(), null
        );
    }
}
