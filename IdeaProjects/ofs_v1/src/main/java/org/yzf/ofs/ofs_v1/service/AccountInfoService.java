package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.AccountInfo;
import org.yzf.ofs.ofs_v1.mapper.AccountInfoMapper;

import java.util.List;

@Service
public class AccountInfoService {
    @Autowired
    AccountInfoMapper accountInfoMapper;

    public List<AccountInfo> getAll()
    {
        List<AccountInfo> list = accountInfoMapper.getAllAccountInfo();
        return list;
    }

    public List<AccountInfo> getOne(AccountInfo accountInfo)
    {
        List<AccountInfo> list = accountInfoMapper.getAccountInfoById(accountInfo);
        return list;
    }

    public int add(AccountInfo accountInfo)
    {
        return accountInfoMapper.addAccountInfo(accountInfo);
    }

    public int upd(AccountInfo accountInfo)
    {
        return accountInfoMapper.updAccountInfoById(accountInfo);
    }

    public int del(AccountInfo accountInfo)
    {
        return accountInfoMapper.delAccountInfoById(accountInfo);
    }
}
