package cn.will.controller;

import cn.will.service.AccountService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: will
 * Date: 18:42 2017/10/10
 */
@RestController
@RequestMapping(value = "/account")
@MapperScan("cn.will.dao")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/buy", method = RequestMethod.GET)
    public void buy() {
        accountService.buy();
    }

}
