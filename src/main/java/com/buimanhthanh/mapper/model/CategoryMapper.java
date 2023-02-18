package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Category;
import com.buimanhthanh.model.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CategoryMapper implements Function<Category, CategoryDTO> {
    @Override
    public CategoryDTO apply(Category category) {
        return new CategoryDTO(
                category.getId(),
                category.getName(),
                category.getCode(),
                category.getThumbnail(),
                category.getDescription(),
                category.getLogo()
        );
    }
}
