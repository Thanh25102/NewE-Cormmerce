package com.buimanhthanh.service;

import com.buimanhthanh.model.AccountDTO;

import java.util.List;

public interface IAccountService {
    List<AccountDTO> findAll();
    AccountDTO findByUsername(String username);
    AccountDTO findByEmail(String email);
    AccountDTO findByUsernameAndEmail(String username,String email);
    AccountDTO saveOrUpdate(AccountDTO accountDTO);
}
