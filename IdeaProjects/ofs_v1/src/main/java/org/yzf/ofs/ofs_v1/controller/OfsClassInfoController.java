package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.OfsClassInfoEntity;
import org.yzf.ofs.ofs_v1.service.OfsClassInfoService;

import java.util.List;
@RestController
@RequestMapping("/classInfo")
public class OfsClassInfoController {
    @Autowired
    private OfsClassInfoService ofsClassInfoService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<OfsClassInfoEntity> getAll() {
        List<OfsClassInfoEntity> retList = ofsClassInfoService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<OfsClassInfoEntity> getById(@RequestBody OfsClassInfoEntity ofsClassInfo) {
        List<OfsClassInfoEntity> retList = ofsClassInfoService.getOne(ofsClassInfo);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody OfsClassInfoEntity ofsClassInfo) {
        return ofsClassInfoService.add(ofsClassInfo);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody OfsClassInfoEntity ofsClassInfo) {
        return ofsClassInfoService.upd(ofsClassInfo);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody OfsClassInfoEntity ofsClassInfo) {
        return ofsClassInfoService.del(ofsClassInfo);
    }
}
