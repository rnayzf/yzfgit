package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.OfsExamInfoEntity;

import java.util.List;

@Repository
public interface OfsExamInfoMapper {
    List<OfsExamInfoEntity> getAllOfsExamInfo();
    List<OfsExamInfoEntity> getOfsExamInfoById(OfsExamInfoEntity ofsExamInfo);
    int addOfsExamInfo (OfsExamInfoEntity ofsExamInfo);
    int updOfsExamInfoById (OfsExamInfoEntity ofsExamInfo);
    int delOfsExamInfoById (OfsExamInfoEntity ofsExamInfo);
}
