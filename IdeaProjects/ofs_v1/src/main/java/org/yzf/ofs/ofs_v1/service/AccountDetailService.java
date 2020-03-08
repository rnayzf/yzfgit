package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.AccountDetail;
import org.yzf.ofs.ofs_v1.mapper.AccountDetailMapper;

import java.util.List;

@Service
public class AccountDetailService {

    @Autowired
    AccountDetailMapper accountDetailMapper;

    public List<AccountDetail> getAll()
    {
        List<AccountDetail> list = accountDetailMapper.getAllAccountDetail();
        return list;
    }

    public List<AccountDetail> getOne(AccountDetail accountDetail)
    {
        List<AccountDetail> list = accountDetailMapper.getAccountDetailByID(accountDetail);
        return list;
    }

    public int add(AccountDetail accountDetail)
    {
        return accountDetailMapper.addAccountDetail(accountDetail);
    }

    public int upd(AccountDetail accountDetail)
    {
        return accountDetailMapper.updAccountDetailById(accountDetail);
    }

    public int del(AccountDetail accountDetail)
    {
        return accountDetailMapper.delAccountDetailById(accountDetail);
    }
}
