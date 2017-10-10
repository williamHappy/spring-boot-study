package cn.will.service.impl;

import cn.will.dao.UserDao;
import cn.will.entity.UserEntity;
import cn.will.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc:
 * Author: will
 * Date: 16:20 2017/9/29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserEntity findUserByName(String name) {
        return userDao.selectUserByName(name);
    }

    @Override
    public UserEntity findUserById(int id) {
        return userDao.unique(id);
    }
}
