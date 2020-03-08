package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.AccountBalance;
import org.yzf.ofs.ofs_v1.mapper.AccountBalanceMapper;

import java.util.List;
@Service
public class AccountBalanceService {
    @Autowired
    AccountBalanceMapper accountBalanceMapper;

    public List<AccountBalance> getAll()
    {
        List<AccountBalance> list = accountBalanceMapper.getAllAccountBalance();
        return list;
    }

    public List<AccountBalance> getOne(AccountBalance accountBalance)
    {
        List<AccountBalance> list = accountBalanceMapper.getAccountBalanceById(accountBalance);
        return list;
    }

    public int add(AccountBalance accountBalance)
    {
        return accountBalanceMapper.addAccountBalance(accountBalance);
    }

    public int upd(AccountBalance accountBalance)
    {
        return accountBalanceMapper.updAccountBalanceById(accountBalance);
    }

    public int del(AccountBalance accountBalance)
    {
        return accountBalanceMapper.delAccountBalanceById(accountBalance);
    }
}
