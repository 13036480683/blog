package com.xx.blog.mapper;

import com.xx.blog.entity.Language;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.*;
import java.util.List;

/**
 * @Author xuxiao
 * @create 2020-03-24
 */
@Mapper
public interface LanguageMapper {
    @Select("select * from language")
    List<Language> getAllLanguage();
}
