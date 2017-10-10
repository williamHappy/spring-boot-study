package cn.will.service.impl;

import cn.will.dao.AccountDao;
import cn.will.entity.AccountEntity;
import cn.will.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc:
 * Author: will
 * Date: 14:43 2017/9/29
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public AccountEntity save(AccountEntity accountEntity) {
        accountEntity = accountDao.save(accountEntity);
        return accountEntity;
    }

    @Override
    public AccountEntity findAccountById(int id) {
        AccountEntity accountEntity = accountDao.findOne(id);
        return accountEntity;
    }
}
