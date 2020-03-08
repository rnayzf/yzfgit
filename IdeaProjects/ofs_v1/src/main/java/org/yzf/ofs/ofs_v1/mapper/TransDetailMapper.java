package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.TransDetail;

import java.util.List;
@Repository
public interface TransDetailMapper {
    List<TransDetail> getAllTransDetail();
    List<TransDetail> getTransDetailById(TransDetail transDetail);
    int addTransDetail (TransDetail transDetail);
    int updTransDetailById (TransDetail transDetail);
    int delTransDetailById (TransDetail transDetail);
}
