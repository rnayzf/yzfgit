package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yzf.ofs.ofs_v1.entity.OfsTeamInfoEntity;
import org.yzf.ofs.ofs_v1.service.OfsTeamInfoService;

import java.util.List;
@RestController
@RequestMapping("/teamInfo")
public class OfsTeamInfoController {
    @Autowired
    private OfsTeamInfoService ofsTeamInfoService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<OfsTeamInfoEntity> getAll() {
        List<OfsTeamInfoEntity> retList = ofsTeamInfoService.getAll();
        return retList;
    }

    @RequestMapping("/getById")
    @ResponseBody
    public List<OfsTeamInfoEntity> getById(@RequestBody OfsTeamInfoEntity ofsTeamInfo) {
        List<OfsTeamInfoEntity> retList = ofsTeamInfoService.getOne(ofsTeamInfo);
        return retList;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(@RequestBody OfsTeamInfoEntity ofsTeamInfo) {
        return ofsTeamInfoService.add(ofsTeamInfo);
    }
    @RequestMapping("/upd")
    @ResponseBody
    public int updById(@RequestBody OfsTeamInfoEntity ofsTeamInfo) {
        return ofsTeamInfoService.upd(ofsTeamInfo);
    }
    @RequestMapping("/del")
    @ResponseBody
    public int delById(@RequestBody OfsTeamInfoEntity ofsTeamInfo) {
        return ofsTeamInfoService.del(ofsTeamInfo);
    }
}
