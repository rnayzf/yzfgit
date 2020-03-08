package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.AccountInfo;

import java.util.List;
@Repository
public interface AccountInfoMapper {

    List<AccountInfo> getAllAccountInfo();
    List<AccountInfo> getAccountInfoById(AccountInfo accountInfo);
    int addAccountInfo (AccountInfo accountInfo);
    int updAccountInfoById (AccountInfo accountInfo);
    int delAccountInfoById (AccountInfo accountInfo);

}
