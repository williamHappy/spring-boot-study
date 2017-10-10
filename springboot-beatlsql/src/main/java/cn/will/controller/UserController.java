package cn.will.controller;

import cn.will.entity.UserEntity;
import cn.will.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Desc:
 * Author: will
 * Date: 16:22 2017/9/29
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findbyname", method = RequestMethod.GET)
    public UserEntity getUserByName(@RequestParam(value = "name") String name) {
        UserEntity userEntity = userService.findUserByName(name);
        return userEntity;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserEntity getUserById(@PathVariable("id") int id) {
        UserEntity userEntity = userService.findUserById(id);
        return userEntity;
    }

}
