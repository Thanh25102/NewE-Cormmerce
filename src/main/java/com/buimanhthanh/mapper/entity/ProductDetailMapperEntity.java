package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.ProductDetail;
import com.buimanhthanh.model.ProductDetailDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductDetailMapperEntity implements Function<ProductDetailDTO, ProductDetail> {
    @Override
    public ProductDetail apply(ProductDetailDTO productDetailDTO) {
        return new ProductDetail(
                productDetailDTO.id(), productDetailDTO.productId(), productDetailDTO.description(), productDetailDTO.image(),
                null, null, null, null, null
        );
    }
}
