package com.xx.blog.service;

import com.xx.blog.entity.Article;
import com.xx.blog.entity.Language;
import com.xx.blog.entity.Type;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticle();
    List<Article> getArticleByType(String type);
    Article getAriticleById(Integer id);



    List<Language> getAllLanguage();

    List<Type> getAllType();
}
