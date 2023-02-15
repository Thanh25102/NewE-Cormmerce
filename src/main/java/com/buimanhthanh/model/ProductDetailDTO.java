package com.buimanhthanh.model;

public record ProductDetailDTO(
        Integer id,
        Integer productId,
        Integer sizeId,
        Integer colorId,
        Integer quantity,
        String description,
        String image
) {

}
