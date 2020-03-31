package com.xx.blog.mapper;

import com.xx.blog.entity.Type;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author xuxiao
 * @create 2020-03-24
 */
public interface TypeMapper {
    @Select("select * from type")
    List<Type> getAllType();
}
