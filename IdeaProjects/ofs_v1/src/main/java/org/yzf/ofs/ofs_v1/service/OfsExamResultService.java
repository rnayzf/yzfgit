package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.OfsExamResultEntity;
import org.yzf.ofs.ofs_v1.mapper.OfsExamResultMapper;

import java.util.List;
@Service
public class OfsExamResultService {
    @Autowired
    OfsExamResultMapper ofsExamResultMapper;

    public List<OfsExamResultEntity> getAll()
    {
        List<OfsExamResultEntity> list = ofsExamResultMapper.getAllOfsExamResult();
        return list;
    }

    public List<OfsExamResultEntity> getOne(OfsExamResultEntity ofsExamResult)
    {
        List<OfsExamResultEntity> list = ofsExamResultMapper.getOfsExamResultById(ofsExamResult);
        return list;
    }

    public int add(OfsExamResultEntity ofsExamResult)
    {
        return ofsExamResultMapper.addOfsExamResult(ofsExamResult);
    }

    public int upd(OfsExamResultEntity ofsExamResult)
    {
        return ofsExamResultMapper.updOfsExamResultById(ofsExamResult);
    }

    public int del(OfsExamResultEntity ofsExamResult)
    {
        return ofsExamResultMapper.delOfsExamResultById(ofsExamResult);
    }
}
