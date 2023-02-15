package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.ProductMapper;
import com.buimanhthanh.model.ProductDTO;
import com.buimanhthanh.repository.ProductRepo;
import com.buimanhthanh.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {
    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    public ProductService(ProductRepo productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> findAll() {
        return productRepo.findAll()
                .stream().map(productMapper)
                .collect(Collectors.toList());
    }
}
