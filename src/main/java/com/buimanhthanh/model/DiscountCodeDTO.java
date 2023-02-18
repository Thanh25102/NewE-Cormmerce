package com.buimanhthanh.model;

public record DiscountCodeDTO(

        Integer id,
        String code,
        Integer salePercent,
        Long saleMoney,
        java.util.Date startDay,
        java.util.Date endDay,
        Long maxDiscount,
        String description
) {

}
