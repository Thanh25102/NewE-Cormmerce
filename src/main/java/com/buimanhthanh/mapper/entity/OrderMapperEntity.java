package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Order;
import com.buimanhthanh.model.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderMapperEntity implements Function<OrderDTO, Order> {
    @Override
    public Order apply(OrderDTO orderDTO) {
        return new Order(
                orderDTO.id(), orderDTO.orderStatus(), orderDTO.ammount(), orderDTO.paymentMethod(), orderDTO.createTime(), orderDTO.phone(), orderDTO.shipingAddress(),
                orderDTO.city(), orderDTO.sumMoney(), null, null, null
        );
    }
}
