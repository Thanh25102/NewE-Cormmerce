package com.buimanhthanh.controller;

import com.buimanhthanh.enums.Status;
import com.buimanhthanh.model.AccountDTO;
import com.buimanhthanh.model.Response;
import com.buimanhthanh.service.impl.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/v1/api")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public ResponseEntity<Response> findAll() {
        List<AccountDTO> accounts = accountService.findAll();
        accounts.forEach(System.out::println);
        return accounts != null ? ResponseEntity.status(HttpStatus.OK).body(new Response(Status.ok, "----Query success----", accounts)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Response(Status.not_found, "----Can't find any account----", List.of()));
    }

    @GetMapping("/accounts/search")
    public ResponseEntity<Response> search(@RequestParam(required = false) String username, @RequestParam(required = false) String email) {
        AccountDTO account = null;
        if (username != null && email != null)
            account = accountService.findByUsernameAndEmail(username, email);
        else if (username != null)
            account = accountService.findByUsername(username);
        else if (email != null)
            account = accountService.findByEmail(email);
//        account = (username != null && email != null)
//                ? accountService.findByUsernameAndEmail(username, email)
//                : (username != null
//                        ? (accountService.findByUsername(username))
//                        : (email != null
//                            ? (accountService.findByEmail(email)) : null));
        return account != null ? ResponseEntity.status(HttpStatus.OK).body(new Response(Status.ok, "----Query success----", account)) : ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Response(Status.failed, "----Can't find account ----", ""));
    }

    @PostMapping("/accounts")
    public ResponseEntity<Response> saveOrUpdate(@RequestBody AccountDTO accountDTO) {
        AccountDTO account = accountService.saveOrUpdate(accountDTO);
        return ResponseEntity.status(HttpStatus.OK).body(new Response(Status.ok, "----Execute success----", account));
    }
}
