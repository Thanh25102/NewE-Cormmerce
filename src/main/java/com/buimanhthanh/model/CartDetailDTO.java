package com.buimanhthanh.model;

public record CartDetailDTO(
        Integer id,
        Integer productId,
        Integer cartId,
        Double price,
        Integer quantity) {

}
