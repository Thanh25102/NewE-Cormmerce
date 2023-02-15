package com.buimanhthanh.model;

public record ProductDTO(
        Integer id,
        String name,
        Double price,
        Integer categoryId,
        String description,
        String thumbnail,
        String represent,
        Integer discountId
) {

}
