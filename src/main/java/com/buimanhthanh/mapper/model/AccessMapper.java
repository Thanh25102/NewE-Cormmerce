package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Access;
import com.buimanhthanh.model.AccessDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AccessMapper implements Function<Access, AccessDTO> {
    @Override
    public AccessDTO apply(Access access) {
        return new AccessDTO(
                access.getId(),
                access.getCode(),
                access.getDescription()
        );
    }
}
