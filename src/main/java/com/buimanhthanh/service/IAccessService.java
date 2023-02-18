package com.buimanhthanh.service;

import com.buimanhthanh.entity.Access;
import com.buimanhthanh.model.AccessDTO;

import java.util.List;

public interface IAccessService {
    List<AccessDTO> findAll();
    AccessDTO findById(Integer id);
    AccessDTO saveOrUpdate(AccessDTO access);

    void delete(Integer id);
    void deletes(List<Integer> ids);
}
