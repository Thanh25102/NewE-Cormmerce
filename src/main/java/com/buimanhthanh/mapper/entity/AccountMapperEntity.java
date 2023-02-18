package com.buimanhthanh.mapper.entity;

import com.buimanhthanh.entity.Account;
import com.buimanhthanh.model.AccountDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AccountMapperEntity implements Function<AccountDTO, Account> {
    @Override
    public Account apply(AccountDTO accountDTO) {
        return new Account(
                accountDTO.getUsername(), accountDTO.getPassword(), accountDTO.getEnabled(), accountDTO.getEmail(), accountDTO.getPhone(), accountDTO.getFullName(),
                accountDTO.getAddress(), accountDTO.getRankAccount(), accountDTO.getAvatar(), null, null, null
        );
    }
}
