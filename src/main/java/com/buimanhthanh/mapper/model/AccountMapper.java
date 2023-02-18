package com.buimanhthanh.mapper.model;

import com.buimanhthanh.entity.Account;
import com.buimanhthanh.entity.Role;
import com.buimanhthanh.model.AccountDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class AccountMapper implements Function<Account, AccountDTO> {
    @Override
    public AccountDTO apply(Account account) {
        Role role = account.getRoleById();
        return new AccountDTO(account.getUsername(), account.getPassword(), account.getEnabled4(), account.getEmail(), account.getPhone(), account.getFullName(), account.getAddress(), account.getRankAccount(), account.getAvatar(), role != null ? role.getId() : null, role != null ? role.getAuthority() : null);
    }
}
