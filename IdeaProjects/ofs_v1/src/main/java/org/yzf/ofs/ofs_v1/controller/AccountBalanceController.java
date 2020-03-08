package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.AccountBalance;
import org.yzf.ofs.ofs_v1.service.AccountBalanceService;


import java.util.List;

@RestController
@RequestMapping("/accountBalance")
public class AccountBalanceController {
    @Autowired
    private AccountBalanceService accountBalanceService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<AccountBalance> getAll() {
        List<AccountBalance> retList = accountBalanceService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<AccountBalance> getById(@RequestBody AccountBalance accountBalance) {
        List<AccountBalance> retList = accountBalanceService.getOne(accountBalance);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody AccountBalance accountBalance) {
        return accountBalanceService.add(accountBalance);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody AccountBalance accountBalance) {
        return accountBalanceService.upd(accountBalance);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody AccountBalance accountBalance) {
        return accountBalanceService.del(accountBalance);
    }

}
