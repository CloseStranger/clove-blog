package com.clovestranger.clove_blog.dao;

import com.clovestranger.clove_blog.model.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    void addArticle(Article article);

    void delArticle(String articleResId);

    void updateArticle(Article article);

    List<Article> articleLists(Article article);

}
