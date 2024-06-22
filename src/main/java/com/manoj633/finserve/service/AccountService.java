package com.manoj633.finserve.service;

import com.manoj633.finserve.dto.AccountDto;
import com.manoj633.finserve.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
}
