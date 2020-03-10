package org.yzf.ofs.ofs_v1.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ofs_team_info", schema = "ofs")
public class OfsTeamInfoEntity {
    private String teamId;
    private String classId;
    private String teamMonitorId;
    private Date creDate;
    private String mark;

    @Id
    @Column(name = "TEAM_ID")
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "CLASS_ID")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "TEAM_MONITOR_ID")
    public String getTeamMonitorId() {
        return teamMonitorId;
    }

    public void setTeamMonitorId(String teamMonitorId) {
        this.teamMonitorId = teamMonitorId;
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
        OfsTeamInfoEntity that = (OfsTeamInfoEntity) o;
        return Objects.equals(teamId, that.teamId) &&
                Objects.equals(classId, that.classId) &&
                Objects.equals(teamMonitorId, that.teamMonitorId) &&
                Objects.equals(creDate, that.creDate) &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, classId, teamMonitorId, creDate, mark);
    }
}
