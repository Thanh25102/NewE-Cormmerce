package com.buimanhthanh.model;

public record DiscountDTO(
        Integer id,
        Integer salePercent,
        java.sql.Date startDay,
        java.sql.Date endDay,
        String description
) {

}
