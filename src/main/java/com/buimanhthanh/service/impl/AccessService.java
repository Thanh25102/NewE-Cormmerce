package com.buimanhthanh.service.impl;

import com.buimanhthanh.entity.Access;
import com.buimanhthanh.mapper.model.AccessMapper;
import com.buimanhthanh.model.AccessDTO;
import com.buimanhthanh.repository.AccessRepo;
import com.buimanhthanh.service.IAccessService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccessService implements IAccessService {
    private final AccessRepo accessRepo;
    private final AccessMapper accessMapper;

    public AccessService(AccessRepo accessRepo, AccessMapper accessMapper) {
        this.accessRepo = accessRepo;
        this.accessMapper = accessMapper;
    }

    @Override
    public List<AccessDTO> findAll() {
        return accessRepo.findAll().stream().map(accessMapper).collect(Collectors.toList());
    }

    @Override
    public AccessDTO findById(Integer id) {
        Optional<Access> optAccess = accessRepo.findById(id);
        return optAccess.isPresent() ?
                accessMapper.apply(optAccess.get()) : null;
    }

    @Override
    public AccessDTO saveOrUpdate(AccessDTO access) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void deletes(List<Integer> ids) {

    }
}
