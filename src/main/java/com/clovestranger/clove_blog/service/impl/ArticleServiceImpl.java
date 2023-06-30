package com.clovestranger.clove_blog.service.impl;

import com.clovestranger.clove_blog.dao.ArticleMapper;
import com.clovestranger.clove_blog.model.Article;
import com.clovestranger.clove_blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    @ResponseBody
    public void addArticle(Article article) {
        article.setArticleResId(String.valueOf(UUID.randomUUID()));
        article.setCreateTime(new Timestamp(System.currentTimeMillis()));
        article.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        articleMapper.addArticle(article);
    }

    @Override
    @ResponseBody
    public void delArticle(String articleResId) {
        articleMapper.delArticle(articleResId);
    }

    @Override
    @ResponseBody
    public void updateArticle(Article article) {
        article.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        articleMapper.updateArticle(article);
    }

    @Override
    @ResponseBody
    public List<Article> articleLists() {
        return articleMapper.articleLists();
    }
}
