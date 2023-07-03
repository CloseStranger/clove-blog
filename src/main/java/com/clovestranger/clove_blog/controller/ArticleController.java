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


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public void updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void delArticle(@RequestParam(value = "articleResId") String articleResId) {
        articleService.delArticle(articleResId);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Article>> articleLists(Article article) {
        System.out.println(article.toString());
        List<Article> list = articleService.articleLists(article);
        return CommonResult.success(list);
    }
}
