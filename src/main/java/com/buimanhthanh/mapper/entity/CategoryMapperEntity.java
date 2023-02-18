package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Category;
import com.buimanhthanh.model.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CategoryMapperEntity implements Function<CategoryDTO, Category> {

    @Override
    public Category apply(CategoryDTO categoryDTO) {
        return new Category(
                categoryDTO.id(), categoryDTO.name(), categoryDTO.code(), categoryDTO.thumbnail(), categoryDTO.description(), categoryDTO.logo(),
                null
        );
    }
}
