package com.clovestranger.clove_blog.dao;

import com.clovestranger.clove_blog.model.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> articleLists();
}
