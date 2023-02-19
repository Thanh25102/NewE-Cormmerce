package com.buimanhthanh.service.impl;

import com.buimanhthanh.entity.Product;
import com.buimanhthanh.model.ProductDTO;
import com.buimanhthanh.repository.ProductMapper;
import com.buimanhthanh.repository.ProductRepo;
import com.buimanhthanh.service.IProductService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductService implements IProductService {
    private final Integer productSize = 8;
    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    public ProductService(ProductRepo productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
    }


    @Override
    public List<ProductDTO> findAll() {
        Pageable pageable = PageRequest.of(0,productSize);
        return productRepo.findAll(pageable)
                .stream().map(productMapper)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> findLatest(Integer quantity) {
        Pageable sortByCreateTime = PageRequest.of(0,quantity,Sort.by("id").descending());
        return productRepo.findAll(sortByCreateTime)
                .stream().map(productMapper)
                .collect(Collectors.toList());
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

}
