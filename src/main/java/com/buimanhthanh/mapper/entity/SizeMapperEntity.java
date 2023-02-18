package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Size;
import com.buimanhthanh.model.SizeDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SizeMapperEntity implements Function<SizeDTO, Size> {
    @Override
    public Size apply(SizeDTO sizeDTO) {
        return new Size(
                sizeDTO.id(),sizeDTO.name(),sizeDTO.code(),sizeDTO.description(),null
        );
    }
}
