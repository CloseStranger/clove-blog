package com.clovestranger.clove_blog.service;

import com.clovestranger.clove_blog.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> articleLists(int page, int pageSize, String searchInput, boolean useStatus);
}
