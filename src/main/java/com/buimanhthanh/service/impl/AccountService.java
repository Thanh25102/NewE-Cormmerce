package com.buimanhthanh.service.impl;

import com.buimanhthanh.entity.Account;
import com.buimanhthanh.mapper.entity.AccountMapperEntity;
import com.buimanhthanh.mapper.model.AccountMapper;
import com.buimanhthanh.model.AccountDTO;
import com.buimanhthanh.repository.AccountRepo;
import com.buimanhthanh.service.IAccountService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class AccountService implements IAccountService {
    private final AccountRepo accountRepo;
    private final AccountMapper accountMapper;
    ;
    private final AccountMapperEntity accountMapperEntity;

    public AccountService(AccountRepo accountRepo, AccountMapper accountMapper, AccountMapperEntity accountMapperEntity) {
        this.accountRepo = accountRepo;
        this.accountMapper = accountMapper;
        this.accountMapperEntity = accountMapperEntity;
    }

    @Override
    public List<AccountDTO> findAll() {
        return accountRepo.findAll()
                .stream().map(accountMapper)
                .collect(Collectors.toList());
    }


    @Override
    public AccountDTO findByUsername(String username) {
        Optional<Account> optAccount = accountRepo.findByUsername(username);
        return optAccount.isPresent() ? accountMapper.apply(optAccount.get()) : null;
    }

    @Override
    public AccountDTO findByEmail(String email) {
        Optional<Account> optAccount = accountRepo.findByEmail(email);
        return optAccount.isPresent() ? accountMapper.apply(optAccount.get()) : null;
    }

    @Override
    public AccountDTO findByUsernameAndEmail(String username, String email) {
        Optional<Account> optAccount = accountRepo.findByUsernameAndEmail(username,email);
        return optAccount.isPresent() ? accountMapper.apply(optAccount.get()) : null;
    }

    @Override
    public AccountDTO saveOrUpdate(AccountDTO accountDTO) {
        Account account = accountRepo.save(accountMapperEntity.apply(accountDTO));
        return accountMapper.apply(account);
    }
}
