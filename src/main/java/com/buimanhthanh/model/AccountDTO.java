package com.buimanhthanh.model;

public record AccountDTO(
        String username,
        String password,
        Byte enabled,
        String email,
        String phone,
        String fullName,
        String address,
        String rankAccount,
        String avatar,
        Integer roleId
) {
}
