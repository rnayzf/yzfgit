package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.AccountInfo;
import org.yzf.ofs.ofs_v1.service.AccountInfoService;

import java.util.List;

@RestController
@RequestMapping("/accountInfo")
public class AccountInfoController {
    @Autowired
    private AccountInfoService accountInfoService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<AccountInfo> getAll() {
        List<AccountInfo> retList = accountInfoService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<AccountInfo> getById(@RequestBody AccountInfo accountInfo) {
        List<AccountInfo> retList = accountInfoService.getOne(accountInfo);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody AccountInfo accountInfo) {
        return accountInfoService.add(accountInfo);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody AccountInfo accountInfo) {
        return accountInfoService.upd(accountInfo);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody AccountInfo accountInfo) {
        return accountInfoService.del(accountInfo);
    }
}
