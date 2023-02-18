package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Access;
import com.buimanhthanh.entity.Color;
import com.buimanhthanh.model.AccessDTO;
import com.buimanhthanh.model.ColorDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ColorMapper implements Function<Color, ColorDTO> {

    @Override
    public ColorDTO apply(Color color) {
        return new ColorDTO(
                color.getId(),
                color.getName(),
                color.getCode(),
                color.getDescription()
        );
    }
}
