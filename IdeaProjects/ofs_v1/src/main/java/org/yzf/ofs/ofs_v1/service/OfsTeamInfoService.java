package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.OfsTeamInfoEntity;
import org.yzf.ofs.ofs_v1.mapper.OfsTeamInfoMapper;

import java.util.List;
@Service
public class OfsTeamInfoService {
    @Autowired
    OfsTeamInfoMapper ofsTeamInfoMapper;

    public List<OfsTeamInfoEntity> getAll()
    {
        List<OfsTeamInfoEntity> list = ofsTeamInfoMapper.getAllOfsTeamInfo();
        return list;
    }

    public List<OfsTeamInfoEntity> getOne(OfsTeamInfoEntity ofsTeamInfo)
    {
        List<OfsTeamInfoEntity> list = ofsTeamInfoMapper.getOfsTeamInfoById(ofsTeamInfo);
        return list;
    }

    public int add(OfsTeamInfoEntity ofsTeamInfo)
    {
        return ofsTeamInfoMapper.addOfsTeamInfo(ofsTeamInfo);
    }

    public int upd(OfsTeamInfoEntity ofsTeamInfo)
    {
        return ofsTeamInfoMapper.updOfsTeamInfoById(ofsTeamInfo);
    }

    public int del(OfsTeamInfoEntity ofsTeamInfo)
    {
        return ofsTeamInfoMapper.delOfsTeamInfoById(ofsTeamInfo);
    }
}
