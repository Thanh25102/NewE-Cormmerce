package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.ColorMapper;
import com.buimanhthanh.model.ColorDTO;
import com.buimanhthanh.repository.ColorRepo;
import com.buimanhthanh.service.IColorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ColorService implements IColorService {

    private final ColorRepo colorRepo;
    private final ColorMapper colorMapper;

    public ColorService(ColorRepo colorRepo, ColorMapper colorMapper) {
        this.colorRepo = colorRepo;
        this.colorMapper = colorMapper;
    }

    @Override
    public List<ColorDTO> findAll() {
        return colorRepo.findAll()
                .stream().map(colorMapper)
                .collect(Collectors.toList());
    }
}
