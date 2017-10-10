package cn.will.dao;

import cn.will.entity.UserEntity;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * Desc:
 * Author: will
 * Date: 15:57 2017/9/29
 */
public interface UserDao extends BaseMapper<UserEntity> {

    @SqlStatement(params = "name")
    UserEntity selectUserByName(String name);
}
