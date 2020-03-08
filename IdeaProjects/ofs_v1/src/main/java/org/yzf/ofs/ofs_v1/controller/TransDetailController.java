package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.AccountInfo;
import org.yzf.ofs.ofs_v1.entity.TransDetail;
import org.yzf.ofs.ofs_v1.service.AccountInfoService;
import org.yzf.ofs.ofs_v1.service.TransDetailService;

import java.util.List;

@RestController
@RequestMapping("/transDetail")
public class TransDetailController {
    @Autowired
    private TransDetailService transDetailService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<TransDetail> getAll() {
        List<TransDetail> retList = transDetailService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<TransDetail> getById(@RequestBody TransDetail transDetail) {
        List<TransDetail> retList = transDetailService.getOne(transDetail);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody TransDetail transDetail) {
        return transDetailService.add(transDetail);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody TransDetail transDetail) {
        return transDetailService.upd(transDetail);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody TransDetail transDetail) {
        return transDetailService.del(transDetail);
    }
}
