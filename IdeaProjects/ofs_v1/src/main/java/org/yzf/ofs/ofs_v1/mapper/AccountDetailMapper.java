package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.AccountDetail;

import java.util.List;

@Repository
public interface AccountDetailMapper {

    List<AccountDetail> getAllAccountDetail();
    List<AccountDetail> getAccountDetailByID(AccountDetail accountDetail);
    int addAccountDetail (AccountDetail accountDetail);
    int updAccountDetailById (AccountDetail accountDetail);
    int delAccountDetailById (AccountDetail accountDetail);

}
