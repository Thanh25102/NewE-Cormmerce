package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Discount;
import com.buimanhthanh.model.DiscountDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DiscountMapperEntity implements Function<DiscountDTO, Discount> {
    @Override
    public Discount apply(DiscountDTO discountDTO) {
        return new Discount(
                discountDTO.id(), discountDTO.salePercent(), discountDTO.startDay(), discountDTO.endDay(), discountDTO.description(), null
        );
    }
}
