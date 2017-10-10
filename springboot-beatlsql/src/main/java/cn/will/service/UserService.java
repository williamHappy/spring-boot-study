package cn.will.service;

import cn.will.entity.UserEntity;

/**
 * Desc:
 * Author: will
 * Date: 16:18 2017/9/29
 */
public interface UserService {
    UserEntity findUserByName(String name);

    UserEntity findUserById(int id);
}
