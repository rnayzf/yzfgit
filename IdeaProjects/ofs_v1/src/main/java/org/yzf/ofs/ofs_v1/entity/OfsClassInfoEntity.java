package org.yzf.ofs.ofs_v1.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ofs_class_info", schema = "ofs")
public class OfsClassInfoEntity {
    private String classId;
    private String className;
    private String classMonitorId;
    private Date creDate;
    private Date finDate;
    private String mark;

    @Id
    @Column(name = "CLASS_ID")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "CLASS_NAME")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "CLASS_MONITOR_ID")
    public String getClassMonitorId() {
        return classMonitorId;
    }

    public void setClassMonitorId(String classMonitorId) {
        this.classMonitorId = classMonitorId;
    }

    @Basic
    @Column(name = "CRE_DATE")
    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    @Basic
    @Column(name = "FIN_DATE")
    public Date getFinDate() {
        return finDate;
    }

    public void setFinDate(Date finDate) {
        this.finDate = finDate;
    }

    @Basic
    @Column(name = "MARK")
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfsClassInfoEntity that = (OfsClassInfoEntity) o;
        return Objects.equals(classId, that.classId) &&
                Objects.equals(className, that.className) &&
                Objects.equals(classMonitorId, that.classMonitorId) &&
                Objects.equals(creDate, that.creDate) &&
                Objects.equals(finDate, that.finDate) &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, className, classMonitorId, creDate, finDate, mark);
    }
}
