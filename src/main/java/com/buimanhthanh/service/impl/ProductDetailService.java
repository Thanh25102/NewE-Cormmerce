package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.ProductDetailMapper;
import com.buimanhthanh.model.ProductDetailDTO;
import com.buimanhthanh.repository.ProductDetailRepo;
import com.buimanhthanh.service.IProductDetailService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductDetailService implements IProductDetailService {

    private final ProductDetailRepo productDetailRepo;
    private final ProductDetailMapper productDetailMapper;

    public ProductDetailService(ProductDetailRepo productDetailRepo, ProductDetailMapper productDetailMapper) {
        this.productDetailRepo = productDetailRepo;
        this.productDetailMapper = productDetailMapper;
    }

    @Override
    public List<ProductDetailDTO> findAll() {
        return productDetailRepo.findAll().stream().map(productDetailMapper).collect(Collectors.toList());
    }
}
