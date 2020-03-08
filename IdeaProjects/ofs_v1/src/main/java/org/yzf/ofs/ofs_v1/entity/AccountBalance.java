package org.yzf.ofs.ofs_v1.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountBalance {

    private String accountNo;
    private Date transDate;
    private BigDecimal balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accountbalance{" +
                "accountNo='" + accountNo + '\'' +
                ", transDate=" + transDate +
                ", banlance=" + balance +
                '}';
    }



}
