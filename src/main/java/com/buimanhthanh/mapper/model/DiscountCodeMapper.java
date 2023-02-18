package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Discount;
import com.buimanhthanh.entity.DiscountCode;
import com.buimanhthanh.model.DiscountCodeDTO;
import com.buimanhthanh.model.DiscountDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DiscountCodeMapper implements Function<DiscountCode, DiscountCodeDTO> {
    @Override
    public DiscountCodeDTO apply(DiscountCode discountCode) {
        return new DiscountCodeDTO(
                discountCode.getId(),
                discountCode.getCode(),
                discountCode.getSalePercent(),
                discountCode.getSaleMoney(),
                discountCode.getStartDay(),
                discountCode.getEndDay(),
                discountCode.getMaxDiscount(),
                discountCode.getDescription()
        );
    }
}
