package com.buimanhthanh.service;

import com.buimanhthanh.model.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> findAll();
}
