package com.buimanhthanh.repository;

import com.buimanhthanh.entity.Product;
import com.buimanhthanh.model.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductMapper implements Function<Product, ProductDTO> {
    @Override
    public ProductDTO apply(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getCategoryByCategoryId() != null
                        ? product.getCategoryByCategoryId().getId() : null,
                product.getDescription(),
                product.getThumbnail(),
                product.getRepresent(),
                product.getDiscountByDiscountId() != null
                        ? product.getDiscountByDiscountId().getId() : null
        );
    }
}
