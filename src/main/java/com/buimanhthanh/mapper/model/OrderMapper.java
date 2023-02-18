package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Order;
import com.buimanhthanh.model.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderMapper implements Function<Order, OrderDTO> {
    @Override
    public OrderDTO apply(Order order) {
        return new OrderDTO(
                order.getId(),
                order.getAccountByUsername().getUsername(),
                order.getOrderStatus(),
                order.getAmmount(),
                order.getPaymentMethod(),
                order.getCreateTime(),
                order.getDiscountCodeByDiscountCodeId().getId(),
                order.getPhone(),
                order.getShipingAddress(),
                order.getCity(),
                order.getSumMoney()
        );
    }
}
