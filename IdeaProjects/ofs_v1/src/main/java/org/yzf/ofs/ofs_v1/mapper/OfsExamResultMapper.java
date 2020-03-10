package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.OfsExamResultEntity;

import java.util.List;

@Repository
public interface OfsExamResultMapper {
    List<OfsExamResultEntity> getAllOfsExamResult();
    List<OfsExamResultEntity> getOfsExamResultById(OfsExamResultEntity ofsExamResult);
    int addOfsExamResult (OfsExamResultEntity ofsExamResult);
    int updOfsExamResultById (OfsExamResultEntity ofsExamResult);
    int delOfsExamResultById (OfsExamResultEntity ofsExamResult);
}
