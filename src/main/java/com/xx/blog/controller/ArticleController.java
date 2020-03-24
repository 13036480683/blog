package com.xx.blog.controller;

import com.xx.blog.entity.Article;
import com.xx.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

//@RestController
@Controller
public class ArticleController {

    @Autowired
    ArticleService service;


    @GetMapping("/article")
    public String getAllArticle(Map<String,Object> map){
        List<Article> articles = service.getAllArticle();
        map.put("articles",articles);
        return "article";
    }

    @GetMapping("/article/{id}")
    public String getArticle(@PathVariable("id") Integer id,Map<String,Object> map){
        map.put("article",service.getAriticleById(id));
        return "context";
    }




}
