package com.clovestranger.clove_blog.controller;

import com.clovestranger.clove_blog.model.Article;
import com.clovestranger.clove_blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Article> articleLists() {
        return articleService.articleLists();
    }

    @GetMapping("test")
    public String test(@RequestParam(value = "number", defaultValue = "123") String number) {
        return String.format("%s!", number);
    }

}
