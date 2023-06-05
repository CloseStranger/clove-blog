package com.clovestranger.clove_blog.dao;

import com.clovestranger.clove_blog.model.Article;

import java.util.List;

public interface ArticleMapper {
    List<Article> articleLists(int page, int pageSize, String searchInput, boolean useStatus);
}
