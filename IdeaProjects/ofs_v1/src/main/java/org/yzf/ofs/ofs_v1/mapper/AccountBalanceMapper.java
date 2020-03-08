package org.yzf.ofs.ofs_v1.mapper;

import org.springframework.stereotype.Repository;
import org.yzf.ofs.ofs_v1.entity.AccountBalance;

import java.util.List;
@Repository
public interface AccountBalanceMapper {
    List<AccountBalance> getAllAccountBalance();
    List<AccountBalance> getAccountBalanceById(AccountBalance accountBalance);
    int addAccountBalance (AccountBalance accountBalance);
    int updAccountBalanceById (AccountBalance accountBalance);
    int delAccountBalanceById (AccountBalance accountBalance);
}
