package com.buimanhthanh.service;

import com.buimanhthanh.entity.Product;
import com.buimanhthanh.model.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
    List<ProductDTO> findLatest(Integer quantity);
    void save(Product product);

}
