package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.OfsStudentInfoEntity;

import java.util.List;

@Repository
public interface OfsStudentInfoMapper {
    List<OfsStudentInfoEntity> getAllOfsStudentInfo();
    List<OfsStudentInfoEntity> getOfsStudentInfoById(OfsStudentInfoEntity ofsStudentInfo);
    int addOfsStudentInfo (OfsStudentInfoEntity OfsStudentInfo);
    int updOfsStudentInfoById (OfsStudentInfoEntity OfsStudentInfo);
    int delOfsStudentInfoById (OfsStudentInfoEntity OfsStudentInfo);
}
