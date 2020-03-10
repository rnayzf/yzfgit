package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.OfsStudentInfoEntity;
import org.yzf.ofs.ofs_v1.mapper.OfsStudentInfoMapper;

import java.util.List;
@Service
public class OfsStudentInfoService {
    @Autowired
    OfsStudentInfoMapper ofsStudentInfoMapper;

    public List<OfsStudentInfoEntity> getAll()
    {
        List<OfsStudentInfoEntity> list = ofsStudentInfoMapper.getAllOfsStudentInfo();
        return list;
    }

    public List<OfsStudentInfoEntity> getOne(OfsStudentInfoEntity ofsStudentInfo)
    {
        List<OfsStudentInfoEntity> list = ofsStudentInfoMapper.getOfsStudentInfoById(ofsStudentInfo);
        return list;
    }

    public int add(OfsStudentInfoEntity ofsStudentInfo)
    {
        return ofsStudentInfoMapper.addOfsStudentInfo(ofsStudentInfo);
    }

    public int upd(OfsStudentInfoEntity ofsStudentInfo)
    {
        return ofsStudentInfoMapper.updOfsStudentInfoById(ofsStudentInfo);
    }

    public int del(OfsStudentInfoEntity ofsStudentInfo)
    {
        return ofsStudentInfoMapper.delOfsStudentInfoById(ofsStudentInfo);
    }
}
