package cn.will.controller;

import cn.will.entity.AccountEntity;
import cn.will.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Desc:
 * Author: will
 * Date: 14:45 2017/9/29
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String postAccount(@RequestParam(name = "name") String name, @RequestParam(name = "money") String money) {
        AccountEntity accountEntity = new AccountEntity();
        BigDecimal moneyDecimal = new BigDecimal(money);
        accountEntity.setName(name);
        accountEntity.setMoney(moneyDecimal);
        AccountEntity accountEntity1Id = accountService.save(accountEntity);
        return accountEntity1Id.toString();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public AccountEntity getAccoutById(@PathVariable("id") int id) {
        AccountEntity accountEntity = accountService.findAccountById(id);
        return accountEntity;
    }
}
