package org.yzf.ofs.ofs_v1.entity;

import java.util.Date;

public class TransDetail {

    private String accountNo;
    private String seqNo;
    private String voucherFilePath;
    private Date entDate;
    private String operId;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getVoucherFilePath() {
        return voucherFilePath;
    }

    public void setVoucherFilePath(String voucherFilePath) {
        this.voucherFilePath = voucherFilePath;
    }

    public Date getEntDate() {
        return entDate;
    }

    public void setEntDate(Date date) {
        this.entDate = entDate;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    @Override
    public String toString() {
        return "Transdetail{" +
                "accountNo='" + accountNo + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", voucherFilePath='" + voucherFilePath + '\'' +
                ", entDate=" + entDate +
                ", operId='" + operId + '\'' +
                '}';
    }



}
