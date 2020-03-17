package com.test.user.service;

import java.util.List;

import com.test.user.entity.User;

/**
 * User业务逻辑接口类
 *
 */
public interface UserService {

    /**
     * 列出所有用户信息
     */
    List<User> showAll();
    /**
     * 根据用户名称查询用户信息
     */
    List<User> selectByName(String name);
    /**
     * 增加用户信息
     * @return
     */
    User selectByID(String id);

//    User selectByName(String name);

    public void addUser(User user);
    /**
     * 根据UserID更新用户信息
     */
    public void updateByUserID(User user);
//    /**
//     * 根据UserName更新用户信息
//     */
//    public void updateByUserName(User user);
    /**
     * 根据UserID删除用户信息
     * @param id
     * @return
     */
    public void deleteByUserID(String id);
    /**
     * 根据UserName删除用户信息
     * @param name
     * @return
     */
//    public void deleteByUserName(String name);
//
}