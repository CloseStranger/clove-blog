package com.clovestranger.clove_blog.service.impl;

import com.clovestranger.clove_blog.dao.ArticleMapper;
import com.clovestranger.clove_blog.model.Article;
import com.clovestranger.clove_blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    @ResponseBody
    public List<Article> articleLists() {
        return articleMapper.articleLists();
    }
}
