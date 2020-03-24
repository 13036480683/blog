package com.xx.blog.service.impl;

import com.xx.blog.entity.Article;
import com.xx.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xx.blog.service.ArticleService;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper mapper;

	@Override
	public List<Article> getAllArticle() {
		return mapper.getAllArticle();
	}

	@Override
	public List<Article> getArticleByType(String type) {
		return mapper.getArticleByType(type);
	}

	@Override
	public Article getAriticleById(Integer id) {
		return mapper.getArticleById(id);
	}
}
