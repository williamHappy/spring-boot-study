package cn.will.controller;

import cn.will.entity.UserEntity;
import cn.will.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Desc:
 * Author: will
 * Date: 19:20 2017/10/9
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserEntity> getUsers() {
        return userService.findUserList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserEntity getUser(@PathVariable("id") int id) {
        return userService.findUser(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String postUser(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age, @RequestParam(value = "password") String password) {
        int n = userService.add(name, age, password);
        if (1 == n) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") int id, @RequestParam(value = "name") String name, @RequestParam(value = "age") int age, @RequestParam(value = "password") String password) {
        int n = userService.update(name, age, password, id);
        if (1 == n)
            return "success";
        else
            return "fail";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id) {
        int n = userService.delete(id);
        if (1 == n)
            return "success";
        else
            return "fail";
    }

}
