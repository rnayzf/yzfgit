package com.test.user.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.test.user.dao.UserDao;
import com.test.user.entity.User;
import com.test.user.service.UserService;

/**
 * UserService逻辑实现类
 *
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

//    @Resource
//    private RedisServiceImpl redisService;

    /**
     * 获取User逻辑：如缓存存在则从换从取值，否则从DB中获取，插入缓存
     */

    public List<User> showAll() {

        return userDao.showAll();
    }



    public List<User> selectByName(String name){
        return userDao.selectByName(name);
    }


    public User selectByID(String id) {

        User user=userDao.selectByID(id);

        return user;
    }



    public void addUser(User user){
        userDao.addUser(user);


    }

    public void updateByUserID(User user) {

        userDao.updateByUserID(user);
    }


    public void deleteByUserID(String id) {

        userDao.deleteByUserID(id);

    }

}