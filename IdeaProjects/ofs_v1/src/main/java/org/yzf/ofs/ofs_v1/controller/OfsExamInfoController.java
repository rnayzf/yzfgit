package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.OfsExamInfoEntity;
import org.yzf.ofs.ofs_v1.service.OfsExamInfoService;

import java.util.List;

@RestController
@RequestMapping("/examInfo")
public class OfsExamInfoController {
    @Autowired
    private OfsExamInfoService ofsExamInfoService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<OfsExamInfoEntity> getAll() {
        List<OfsExamInfoEntity> retList = ofsExamInfoService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<OfsExamInfoEntity> getById(@RequestBody OfsExamInfoEntity ofsExamInfo) {
        List<OfsExamInfoEntity> retList = ofsExamInfoService.getOne(ofsExamInfo);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody OfsExamInfoEntity ofsExamInfo) {
        return ofsExamInfoService.add(ofsExamInfo);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody OfsExamInfoEntity ofsExamInfo) {
        return ofsExamInfoService.upd(ofsExamInfo);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody OfsExamInfoEntity ofsExamInfo) {
        return ofsExamInfoService.del(ofsExamInfo);
    }
}
