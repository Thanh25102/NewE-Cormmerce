package com.buimanhthanh.model;

public record OrderDetailDTO(
        Integer id,
        Integer productId,
        Integer orderId,
        Double price,
        Integer quantity
) {

}
