package org.yzf.ofs.ofs_v1.entity;

public class Subjects {
    private Integer subjectsId;
    private String subjectsName;
    private String subjectsRem;

    public void setSubjectsId(Integer subjectsId) {
        this.subjectsId = subjectsId;
    }

    public void setSubjectsName(String subjectsName) {
        this.subjectsName = subjectsName;
    }

    public void setSubjectsRem(String subjectsRem) {
        this.subjectsRem = subjectsRem;
    }

    public Integer getSubjectsId() {
        return subjectsId;
    }

    public String getSubjectsName() {
        return subjectsName;
    }

    public String getSubjectsRem() {
        return subjectsRem;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjectsId=" + subjectsId +
                ", subjectsName='" + subjectsName + '\'' +
                ", subjectsRem='" + subjectsRem + '\'' +
                '}';
    }


}
