package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Discount;
import com.buimanhthanh.entity.DiscountCode;
import com.buimanhthanh.model.DiscountCodeDTO;
import com.buimanhthanh.model.DiscountDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DiscountMapper implements Function<Discount, DiscountDTO> {
    @Override
    public DiscountDTO apply(Discount discount) {
        return new DiscountDTO(
                discount.getId(),
                discount.getSalePercent(),
                discount.getStartDay(),
                discount.getEndDay(),
                discount.getDescription()
        );
    }
}
