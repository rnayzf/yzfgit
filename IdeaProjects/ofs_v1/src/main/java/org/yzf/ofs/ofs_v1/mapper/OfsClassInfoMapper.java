package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.OfsClassInfoEntity;

import java.util.List;

@Repository
public interface OfsClassInfoMapper {
    List<OfsClassInfoEntity> getAllOfsClassInfo();
    List<OfsClassInfoEntity> getOfsClassInfoById(OfsClassInfoEntity ofsClassInfo);
    int addOfsClassInfo (OfsClassInfoEntity ofsClassInfo);
    int updOfsClassInfoById (OfsClassInfoEntity ofsClassInfo);
    int delOfsClassInfoById (OfsClassInfoEntity ofsClassInfo);
}
