package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Role;
import com.buimanhthanh.model.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class RoleMapperEntity implements Function<RoleDTO, Role> {
    @Override
    public Role apply(RoleDTO roleDTO) {
        return new Role(
                roleDTO.authority(),roleDTO.id(),null,null
        );
    }
}
