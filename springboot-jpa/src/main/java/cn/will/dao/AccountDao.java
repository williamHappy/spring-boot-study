package cn.will.dao;

import cn.will.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Desc:
 * Author: will
 * Date: 14:30 2017/9/29
 */
public interface AccountDao extends JpaRepository<AccountEntity, Integer> {

}
