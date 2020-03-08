package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yzf.ofs.ofs_v1.entity.AccountDetail;
import org.yzf.ofs.ofs_v1.entity.Subjects;
import org.yzf.ofs.ofs_v1.service.AccountDetailService;

import java.util.List;


@RestController
@RequestMapping("/accountDetail")
public class AccountDetailController {
    @Autowired
    private AccountDetailService accountDetailService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<AccountDetail> getAll() {
        List<AccountDetail> retList = accountDetailService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<AccountDetail> getById(@RequestBody AccountDetail accountDetail) {
        List<AccountDetail> retList = accountDetailService.getOne(accountDetail);
        return retList;
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody AccountDetail accountDetail) {
        return accountDetailService.add(accountDetail);
    }

    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody AccountDetail accountDetail) {
        return accountDetailService.upd(accountDetail);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody AccountDetail accountDetail) {
        return accountDetailService.del(accountDetail);
    }

}
