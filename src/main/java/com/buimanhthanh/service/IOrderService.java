package com.buimanhthanh.service;

import com.buimanhthanh.model.OrderDTO;

import java.util.List;

public interface IOrderService {
    List<OrderDTO> findAll();
}
