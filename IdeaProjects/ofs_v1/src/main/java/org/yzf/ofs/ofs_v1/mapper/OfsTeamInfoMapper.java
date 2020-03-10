package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.OfsTeamInfoEntity;

import java.util.List;
@Repository
public interface OfsTeamInfoMapper {
    List<OfsTeamInfoEntity> getAllOfsTeamInfo();
    List<OfsTeamInfoEntity> getOfsTeamInfoById(OfsTeamInfoEntity ofsTeamInfo);
    int addOfsTeamInfo (OfsTeamInfoEntity ofsTeamInfo);
    int updOfsTeamInfoById (OfsTeamInfoEntity ofsTeamInfo);
    int delOfsTeamInfoById (OfsTeamInfoEntity ofsTeamInfo);
}
