package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.AccountInfo;
import org.yzf.ofs.ofs_v1.entity.OfsClassInfoEntity;
import org.yzf.ofs.ofs_v1.mapper.AccountInfoMapper;
import org.yzf.ofs.ofs_v1.mapper.OfsClassInfoMapper;

import java.util.List;
@Service
public class OfsClassInfoService {
    @Autowired
    OfsClassInfoMapper ofsClassInfoMapper;

    public List<OfsClassInfoEntity> getAll()
    {
        List<OfsClassInfoEntity> list = ofsClassInfoMapper.getAllOfsClassInfo();
        return list;
    }

    public List<OfsClassInfoEntity> getOne(OfsClassInfoEntity ofsClassInfo)
    {
        List<OfsClassInfoEntity> list = ofsClassInfoMapper.getOfsClassInfoById(ofsClassInfo);
        return list;
    }

    public int add(OfsClassInfoEntity ofsClassInfo)
    {
        return ofsClassInfoMapper.addOfsClassInfo(ofsClassInfo);
    }

    public int upd(OfsClassInfoEntity ofsClassInfo)
    {
        return ofsClassInfoMapper.updOfsClassInfoById(ofsClassInfo);
    }

    public int del(OfsClassInfoEntity ofsClassInfo)
    {
        return ofsClassInfoMapper.delOfsClassInfoById(ofsClassInfo);
    }
}
