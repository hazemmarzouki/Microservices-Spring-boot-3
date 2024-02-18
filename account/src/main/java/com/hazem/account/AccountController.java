package com.hazem.account;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public void addClient(@RequestBody Account account) {
        accountService.addAccount(account);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllClients() {
        List<Account> account = accountService.getAllAccounts();
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
