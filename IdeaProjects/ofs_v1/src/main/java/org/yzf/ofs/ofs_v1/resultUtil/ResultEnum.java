package org.yzf.ofs.ofs_v1.resultUtil;

public enum ResultEnum {
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(200,"成功"),
    SUBJECT_NOT_EXIST(1,"subjectid不存在"),
    SUBJECT_IS_EXISTS(2,"subjectid已存在"),
    DATA_IS_NULL(3,"数据为空"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
