package com.clovestranger.clove_blog.service.impl;

import com.clovestranger.clove_blog.dao.ArticleMapper;
import com.clovestranger.clove_blog.model.Article;
import com.clovestranger.clove_blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> articleLists(int page, int pageSize, String searchInput, boolean useStatus) {
        return articleMapper.articleLists(page, pageSize, searchInput, useStatus);
    }
}
