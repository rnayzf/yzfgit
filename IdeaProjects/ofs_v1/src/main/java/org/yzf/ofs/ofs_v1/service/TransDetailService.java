package org.yzf.ofs.ofs_v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yzf.ofs.ofs_v1.entity.TransDetail;
import org.yzf.ofs.ofs_v1.mapper.TransDetailMapper;

import java.util.List;
@Service
public class TransDetailService {
    @Autowired
    TransDetailMapper transDetailMapper;

    public List<TransDetail> getAll()
    {
        List<TransDetail> list = transDetailMapper.getAllTransDetail();
        return list;
    }

    public List<TransDetail> getOne(TransDetail transDetail)
    {
        List<TransDetail> list = transDetailMapper.getTransDetailById(transDetail);
        return list;
    }

    public int add(TransDetail transDetail)
    {
        return transDetailMapper.addTransDetail(transDetail);
    }

    public int upd(TransDetail transDetail)
    {
        return transDetailMapper.updTransDetailById(transDetail);
    }

    public int del(TransDetail transDetail)
    {
        return transDetailMapper.delTransDetailById(transDetail);
    }
}
