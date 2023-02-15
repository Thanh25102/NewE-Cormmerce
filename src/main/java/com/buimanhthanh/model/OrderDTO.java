package com.buimanhthanh.model;

public record OrderDTO(
        Integer id,
        String username,
        String orderStatus,
        Integer ammount,
        String paymentMethod,
        java.sql.Timestamp createTime,
        Integer discountCodeId,
        String phone,
        String shipingAddress,
        String city,
        Double sumMoney
) {

}
