package org.yzf.ofs.ofs_v1.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

public class AccountInfo {

    private String accountNo;
    private String accountName;
    private String mark;
    private BigDecimal balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accountinfo{" +
                "accountNo='" + accountNo + '\'' +
                ", accountName='" + accountName + '\'' +
                ", mark='" + mark + '\'' +
                ", banlance=" + balance +
                '}';
    }


}
