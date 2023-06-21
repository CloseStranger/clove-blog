package com.clovestranger.clove_blog.service;

import com.clovestranger.clove_blog.model.Article;

import java.util.List;

public interface ArticleService {

    void addArticle(Article article);

    void delArticle(String resourceId);

    void updateArticle(Article article);

    List<Article> articleLists();
    
}
