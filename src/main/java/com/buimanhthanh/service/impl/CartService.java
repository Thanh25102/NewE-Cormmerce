package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.CartMapper;
import com.buimanhthanh.model.CartDTO;
import com.buimanhthanh.repository.CartRepo;
import com.buimanhthanh.service.ICartService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartService implements ICartService {
    private final CartRepo cartRepo;
    private final CartMapper cartMapper;

    public CartService(CartRepo cartRepo, CartMapper cartMapper) {
        this.cartRepo = cartRepo;
        this.cartMapper = cartMapper;
    }

    @Override
    public List<CartDTO> findAll() {
        return cartRepo.findAll()
                .stream().map(cartMapper)
                .collect(Collectors.toList());
    }
}
