package com.test.user.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;


@Setter
@Getter
@JsonAutoDetect
public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * UserID编号
     */

    private String id;
    /**
     * UserName用户名称
     */
    private String name;
    /**
     * UserBirth用户生日
     */
    private Date birthday;
    /**
     * 描述
     */
    private String description;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ",name=" + name +
                ",birthday=" + birthday +
                ",description=" + description + "}";
    }
}

