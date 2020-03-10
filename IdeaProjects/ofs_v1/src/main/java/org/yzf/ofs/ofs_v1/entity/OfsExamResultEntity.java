package org.yzf.ofs.ofs_v1.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ofs_exam_result", schema = "ofs")
@IdClass(OfsExamResultEntityPK.class)
public class OfsExamResultEntity {
    private String examId;
    private String studentId;
    private Date examDate;
    private String examResult;

    @Id
    @Column(name = "EXAM_ID")
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    @Id
    @Column(name = "STUDENT_ID")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "EXAM_DATE")
    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    @Basic
    @Column(name = "EXAM_RESULT")
    public String getExamResult() {
        return examResult;
    }

    public void setExamResult(String examResult) {
        this.examResult = examResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfsExamResultEntity that = (OfsExamResultEntity) o;
        return Objects.equals(examId, that.examId) &&
                Objects.equals(studentId, that.studentId) &&
                Objects.equals(examDate, that.examDate) &&
                Objects.equals(examResult, that.examResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, studentId, examDate, examResult);
    }
}
