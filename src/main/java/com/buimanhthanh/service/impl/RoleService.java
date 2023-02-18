package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.RoleMapper;
import com.buimanhthanh.model.RoleDTO;
import com.buimanhthanh.repository.RoleRepo;
import com.buimanhthanh.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService implements IRoleService {
    private final RoleRepo roleRepo;
    private final RoleMapper roleMapper;

    public RoleService(RoleRepo roleRepo, RoleMapper roleMapper) {
        this.roleRepo = roleRepo;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> findAll() {
        return roleRepo.findAll().stream().map(roleMapper).collect(Collectors.toList());
    }
}
