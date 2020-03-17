package com.xx.blog.mapper;

import com.xx.blog.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author xuxiao
 * @create 2020-03-12
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where name=#{name} and password=#{password}")
    User getUser(@Param("name")String name, @Param("password")String password);

    @Select("select * from user")
    List<User> getAllUser();

    @Update("update user set password={#newPassword}")
    public void updateUser(User user);

    @Insert("insert into user(name,password) values(#{name},#{password})")
    public void addUser(User user);

    @Delete("delete * from user where name=#{name} and password=#{password}")
    public void deleteUser(@Param("name") String name, @Param("password") String password);

}
