package com.test.springboot.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.test.springboot.dao.AccountDao;
import com.test.springboot.pojo.Account;
import com.test.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public int insertAccount(Account account) {
        if (StringUtils.isEmpty(account.getAUsername())) {
            return 0;
        }
        if (StringUtils.isEmpty(account.getAPassword())) {
            return 0;
        }
        int rows = accountDao.insert(account);
        if (rows < 1) {
            return 0;
        }
        return rows;
    }

    @Override
    public boolean loginAccount(String aUsername, String aPassword) {
        Account a = accountDao.loginAccount(aUsername, aPassword);
        if (a == null) {
            return false;
        }
        return true;
    }
}
