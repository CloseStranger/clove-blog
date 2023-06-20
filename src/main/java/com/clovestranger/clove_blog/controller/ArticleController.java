package com.clovestranger.clove_blog.controller;

import com.clovestranger.clove_blog.common.CommonResult;
import com.clovestranger.clove_blog.model.Article;
import com.clovestranger.clove_blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult articleLists() {
        List<Article> list = articleService.articleLists();
        return CommonResult.success(list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }
}
