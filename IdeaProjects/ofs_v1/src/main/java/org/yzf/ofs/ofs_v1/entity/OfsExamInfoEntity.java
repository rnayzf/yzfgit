package org.yzf.ofs.ofs_v1.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ofs_exam_info", schema = "ofs")
public class OfsExamInfoEntity {
    private String examId;
    private String correlateId;
    private String mark;
    private Date examDate;

    @Id
    @Column(name = "EXAM_ID")
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    @Basic
    @Column(name = "CORRELATE_ID")
    public String getCorrelateId() {
        return correlateId;
    }

    public void setCorrelateId(String correlateId) {
        this.correlateId = correlateId;
    }

    @Basic
    @Column(name = "MARK")
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Basic
    @Column(name = "EXAM_DATE")
    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfsExamInfoEntity that = (OfsExamInfoEntity) o;
        return Objects.equals(examId, that.examId) &&
                Objects.equals(correlateId, that.correlateId) &&
                Objects.equals(mark, that.mark) &&
                Objects.equals(examDate, that.examDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, correlateId, mark, examDate);
    }
}
