package com.test.springboot.service;

import com.test.springboot.pojo.Account;

public interface AccountService {
    int insertAccount(Account account);

    boolean loginAccount(String aUsername, String aPassword);
}
