package com.xx.blog.mapper;

import com.xx.blog.entity.Article;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper{
    @Select("select * from article")
    List<Article> getAllArticle();

    @Select("select * from article where type=#{type}")
    List<Article> getArticleByType(@Param("type") String type);

    @Select("select * from article where id=#{id}")
    Article getArticleById(@Param("id") Integer id);

}
