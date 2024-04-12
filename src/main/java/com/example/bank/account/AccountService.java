package com.example.bank.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountResponse.MainDTO 계좌목록보기(int userId){
        List<Account> accountList = accountRepository.findByUserId(userId);
        return new AccountResponse.MainDTO(accountList);
    }
}