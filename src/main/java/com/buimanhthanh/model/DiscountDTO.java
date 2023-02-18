package com.buimanhthanh.model;

public record DiscountDTO(
        Integer id,
        Integer salePercent,
        java.util.Date startDay,
        java.util.Date endDay,
        String description
) {

}
