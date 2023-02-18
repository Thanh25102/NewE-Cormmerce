package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.ProductDetail;
import com.buimanhthanh.model.ProductDetailDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductDetailMapper implements Function<ProductDetail, ProductDetailDTO> {
    @Override
    public ProductDetailDTO apply(ProductDetail productDetail) {
        return new ProductDetailDTO(
                productDetail.getId(),
                productDetail.getProductByProductId().getId(),
                productDetail.getSizeBySizeId().getId(), productDetail.getColorByColorId().getId(),
                productDetail.getQuantity(), productDetail.getDescription(), productDetail.getImage()
        );
    }
}
