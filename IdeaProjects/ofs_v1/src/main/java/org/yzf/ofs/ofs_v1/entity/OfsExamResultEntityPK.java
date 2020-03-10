package org.yzf.ofs.ofs_v1.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OfsExamResultEntityPK implements Serializable {
    private String examId;
    private String studentId;

    @Column(name = "EXAM_ID")
    @Id
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    @Column(name = "STUDENT_ID")
    @Id
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfsExamResultEntityPK that = (OfsExamResultEntityPK) o;
        return Objects.equals(examId, that.examId) &&
                Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, studentId);
    }
}
