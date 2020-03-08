package org.yzf.ofs.ofs_v1.entity;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

public class AccountDetail {

    private String accountNo;
    private String studentId;
    private String drandcr;
    private BigDecimal amount;
    private String seqNo;
    private Date transDate;
    private Time transTime;
    private String summary;
    private BigDecimal balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDrandcr() {
        return drandcr;
    }

    public void setDrandcr(String drandcr) {
        this.drandcr = drandcr;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Time getTransTime() {
        return transTime;
    }

    public void setTransTime(Time transTime) {
        this.transTime = transTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal banlance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accountdetail{" +
                "accountNo='" + accountNo + '\'' +
                ", studentId='" + studentId + '\'' +
                ", drandcr='" + drandcr + '\'' +
                ", amount='" + amount + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", transDate=" + transDate +
                ", transTime=" + transTime +
                ", summary='" + summary + '\'' +
                ", banlance=" + balance +
                '}';
    }

}
