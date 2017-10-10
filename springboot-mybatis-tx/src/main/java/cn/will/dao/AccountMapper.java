package cn.will.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Desc:
 * Author: will
 * Date: 18:28 2017/10/10
 */
public interface AccountMapper {
    int update(@Param("money") double money, @Param("id") int id);
}
