package com.buimanhthanh.model;

public record DiscountCodeDTO(

        Integer id,
        String code,
        Integer salePercent,
        Long saleMoney,
        java.sql.Date startDay,
        java.sql.Date endDay,
        Long maxDiscount,
        String description
) {

}
