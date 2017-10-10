package cn.will.service;

import cn.will.dao.UserMapper;
import cn.will.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:
 * Author: will
 * Date: 19:10 2017/10/9
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int add(String name, int age, String password) {
        return userMapper.insert(name, age, password);
    }

    public int update(String name, int age, String password, int id) {
        return userMapper.update(name, age, password, id);
    }

    public int delete(int id) {
        return userMapper.delete(id);
    }

    public UserEntity findUser(int id) {
        return userMapper.selectUser(id);
    }

    public List<UserEntity> findUserList() {
        return userMapper.selectUserList();
    }

}
