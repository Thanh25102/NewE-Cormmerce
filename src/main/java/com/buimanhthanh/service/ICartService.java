package com.buimanhthanh.service;

import com.buimanhthanh.model.CartDTO;

import java.util.List;

public interface ICartService {
    List<CartDTO> findAll();
}
