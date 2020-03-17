package com.xx.blog.controller;

import com.xx.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@RestController
@Controller
public class ArticleController {

    @Autowired
    ArticleService service;
}
