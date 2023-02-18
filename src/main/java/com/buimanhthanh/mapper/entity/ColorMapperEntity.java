package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Color;
import com.buimanhthanh.model.ColorDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ColorMapperEntity implements Function<ColorDTO, Color> {
    @Override
    public Color apply(ColorDTO colorDTO) {
        return new Color(
                colorDTO.id(),colorDTO.name(),colorDTO.code(),colorDTO.description(),null
        );
    }
}
