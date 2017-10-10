package cn.will.service;

import cn.will.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Desc:
 * Author: will
 * Date: 18:38 2017/10/10
 */
@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional
    public void buy() throws RuntimeException {
        accountMapper.update(80, 1);
        int i = 1 / 0;
        accountMapper.update(120, 1);
    }

}
