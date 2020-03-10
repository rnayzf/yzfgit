package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.OfsExamResultEntity;
import org.yzf.ofs.ofs_v1.service.OfsExamResultService;

import java.util.List;
@RestController
@RequestMapping("/examResult")
public class OfsExamResultController {
    @Autowired
    private OfsExamResultService ofsExamResultService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<OfsExamResultEntity> getAll() {
        List<OfsExamResultEntity> retList = ofsExamResultService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<OfsExamResultEntity> getById(@RequestBody OfsExamResultEntity ofsExamResult) {
        List<OfsExamResultEntity> retList = ofsExamResultService.getOne(ofsExamResult);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody OfsExamResultEntity ofsExamResult) {
        return ofsExamResultService.add(ofsExamResult);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody OfsExamResultEntity ofsExamResult) {
        return ofsExamResultService.upd(ofsExamResult);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody OfsExamResultEntity ofsExamResult) {
        return ofsExamResultService.del(ofsExamResult);
    }
}
