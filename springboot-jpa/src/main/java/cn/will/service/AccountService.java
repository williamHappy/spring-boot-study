package cn.will.service;

import cn.will.entity.AccountEntity;

/**
 * Desc:
 * Author: will
 * Date: 14:42 2017/9/29
 */
public interface AccountService {

    AccountEntity save(AccountEntity accountEntity);

    AccountEntity findAccountById(int id);
}
