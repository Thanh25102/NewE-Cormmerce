package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.SizeMapper;
import com.buimanhthanh.model.SizeDTO;
import com.buimanhthanh.repository.SizeRepo;
import com.buimanhthanh.service.ISizeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SizeService implements ISizeService {
    private final SizeRepo sizeRepo;
    private final SizeMapper sizeMapper;

    public SizeService(SizeRepo sizeRepo, SizeMapper sizeMapper) {
        this.sizeRepo = sizeRepo;
        this.sizeMapper = sizeMapper;
    }

    @Override
    public List<SizeDTO> findAll() {
        return sizeRepo.findAll().stream().map(sizeMapper).collect(Collectors.toList());
    }
}
