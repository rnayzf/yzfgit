package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.OfsStudentInfoEntity;
import org.yzf.ofs.ofs_v1.service.OfsStudentInfoService;

import java.util.List;
@RestController
@RequestMapping("/studentInfo")
public class OfsStudentController {
    @Autowired
    private OfsStudentInfoService ofsStudentInfoService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<OfsStudentInfoEntity> getAll() {
        List<OfsStudentInfoEntity> retList = ofsStudentInfoService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<OfsStudentInfoEntity> getById(@RequestBody OfsStudentInfoEntity ofsStudentInfo) {
        List<OfsStudentInfoEntity> retList = ofsStudentInfoService.getOne(ofsStudentInfo);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody OfsStudentInfoEntity ofsStudentInfo) {
        return ofsStudentInfoService.add(ofsStudentInfo);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody OfsStudentInfoEntity ofsStudentInfo) {
        return ofsStudentInfoService.upd(ofsStudentInfo);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody OfsStudentInfoEntity ofsStudentInfo) {
        return ofsStudentInfoService.del(ofsStudentInfo);
    }
}
