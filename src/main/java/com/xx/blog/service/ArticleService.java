package com.xx.blog.service;

import com.xx.blog.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticle();
    List<Article> getArticleByType(String type);

    Article getAriticleById(Integer id);

}
