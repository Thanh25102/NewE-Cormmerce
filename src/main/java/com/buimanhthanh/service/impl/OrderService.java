package com.buimanhthanh.service.impl;

import com.buimanhthanh.mapper.model.OrderMapper;
import com.buimanhthanh.model.OrderDTO;
import com.buimanhthanh.repository.OrderRepo;
import com.buimanhthanh.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService implements IOrderService {
    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepo orderRepo, OrderMapper orderMapper) {
        this.orderRepo = orderRepo;
        this.orderMapper = orderMapper;
    }

    @Override
    public List<OrderDTO> findAll() {
        return orderRepo.findAll().stream().map(orderMapper).collect(Collectors.toList());
    }
}
