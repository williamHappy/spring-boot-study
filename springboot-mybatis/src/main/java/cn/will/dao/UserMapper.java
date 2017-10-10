package cn.will.dao;

import cn.will.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * Desc:
 * Author: will
 * Date: 18:51 2017/10/9
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user_entity(name,age,password) values (#{name}, #{age}, #{password})")
    int insert(@Param("name") String name, @Param("age") int age, @Param("password") String password);

    @Update("update user_entity set name = #{name}, age = #{age}, password = #{password} where id = #{id}")
    int update(@Param("name") String name, @Param("age") int age, @Param("password") String password, @Param("id") int id);

    @Delete("delete from user_entity where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, age as age, password as password from user_entity where id = #{id}")
    UserEntity selectUser(@Param("id") int id);

    @Select("select * from user_entity")
    List<UserEntity> selectUserList();

}
