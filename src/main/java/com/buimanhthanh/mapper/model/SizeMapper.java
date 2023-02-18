package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Size;
import com.buimanhthanh.model.SizeDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SizeMapper implements Function<Size, SizeDTO> {
    @Override
    public SizeDTO apply(Size size) {
        return new SizeDTO(
                size.getId(),
                size.getName(),
                size.getCode(),
                size.getDescription()
        );
    }
}
