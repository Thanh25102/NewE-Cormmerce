package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Role;
import com.buimanhthanh.model.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class RoleMapper implements Function<Role, RoleDTO> {
    @Override
    public RoleDTO apply(Role role) {
        return new RoleDTO(
                role.getId(),
                role.getAuthority());
    }
}
