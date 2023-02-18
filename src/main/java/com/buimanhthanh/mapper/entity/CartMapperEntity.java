package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Cart;
import com.buimanhthanh.model.CartDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CartMapperEntity implements Function<CartDTO, Cart> {
    @Override
    public Cart apply(CartDTO cartDTO) {
        return new Cart(
                cartDTO.id(), cartDTO.ammount(), null, null
        );
    }
}
