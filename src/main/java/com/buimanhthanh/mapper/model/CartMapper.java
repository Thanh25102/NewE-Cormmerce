package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Cart;
import com.buimanhthanh.model.CartDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CartMapper implements Function<Cart, CartDTO> {
    @Override
    public CartDTO apply(Cart cart) {
        return new CartDTO(
                cart.getId(),
                cart.getAmmount(),
                cart.getAccountByUsername().getUsername()
        );
    }
}
