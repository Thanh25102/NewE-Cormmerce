package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Access;
import com.buimanhthanh.model.AccessDTO;
import com.buimanhthanh.repository.AccessRepo;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AccessMapperEntity implements Function<AccessDTO, Access> {

    @Override
    public Access apply(AccessDTO accessDTO) {
           return new Access(
                   accessDTO.id(),
                   accessDTO.code(),
                   accessDTO.description(),
                   null
           );
    }
}
