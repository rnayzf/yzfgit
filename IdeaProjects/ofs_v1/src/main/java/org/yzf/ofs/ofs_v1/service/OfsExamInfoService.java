package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.OfsExamInfoEntity;
import org.yzf.ofs.ofs_v1.mapper.OfsExamInfoMapper;

import java.util.List;
@Service
public class OfsExamInfoService {
    @Autowired
    OfsExamInfoMapper ofsExamInfoMapper;

    public List<OfsExamInfoEntity> getAll()
    {
        List<OfsExamInfoEntity> list = ofsExamInfoMapper.getAllOfsExamInfo();
        return list;
    }

    public List<OfsExamInfoEntity> getOne(OfsExamInfoEntity ofsExamInfo)
    {
        List<OfsExamInfoEntity> list = ofsExamInfoMapper.getOfsExamInfoById(ofsExamInfo);
        return list;
    }

    public int add(OfsExamInfoEntity ofsExamInfo)
    {
        return ofsExamInfoMapper.addOfsExamInfo(ofsExamInfo);
    }

    public int upd(OfsExamInfoEntity ofsExamInfo)
    {
        return ofsExamInfoMapper.updOfsExamInfoById(ofsExamInfo);
    }

    public int del(OfsExamInfoEntity ofsExamInfo)
    {
        return ofsExamInfoMapper.delOfsExamInfoById(ofsExamInfo);
    }
}
