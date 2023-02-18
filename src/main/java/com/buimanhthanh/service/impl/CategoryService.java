package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.CategoryMapper;
import com.buimanhthanh.model.CategoryDTO;
import com.buimanhthanh.repository.CategoryRepo;
import com.buimanhthanh.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {
    private final CategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;

    public CategoryService(CategoryRepo categoryRepo, CategoryMapper categoryMapper) {
        this.categoryRepo = categoryRepo;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryDTO> findAll() {
        return categoryRepo.findAll()
                .stream().map(categoryMapper)
                .collect(Collectors.toList());
    }
}
