package com.clovestranger.clove_blog.service.impl;

import com.clovestranger.clove_blog.dao.ArticleMapper;
import com.clovestranger.clove_blog.model.Article;
import com.clovestranger.clove_blog.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.*;


@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    @ResponseBody
    public void addArticle(Article article) {
        article.setArticleResId(String.valueOf(UUID.randomUUID()));
        article.setCreateTime(new Timestamp(System.currentTimeMillis()));
        article.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        System.out.println(article);
        articleMapper.addArticle(article);
    }

    @Override
    @ResponseBody
    public void delArticle(String articleResId) {
        articleMapper.delArticle(articleResId);
    }

    @Override
    @ResponseBody
    public void updateArticle(Article article) {
        article.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        articleMapper.updateArticle(article);
    }

    @Override
    @ResponseBody
    public List<Article> articleLists(Article article, String tagIds) {
        List<Article> dbInfo = articleMapper.articleLists(article);
        if (tagIds != null) {
            List<Article> output = new ArrayList<>();
//            String[] filterTags = Arrays.stream(tagIds.split(",")).sorted().toArray(String[]::new);
//            dbInfo.forEach(item -> {
//                String[] itemTags = item.getTags().stream().map(x -> Integer.toString(x.getId())).sorted().toArray(String[]::new);
//                if (filterTags.length > itemTags.length) {
//                    return;
//                }
//                boolean pushSignal = true;
//                for (String filterTag : filterTags) {
//                    pushSignal = pushSignal && (Arrays.binarySearch(itemTags, filterTag) != -1);
//                }
//                if (pushSignal) {
//                    output.add(item);
//                }
//            });
            List<String> filterTags = Arrays.stream(tagIds.split(",")).sorted().toList();
            dbInfo.forEach(item -> {
                List<String> itemTags = item.getTags().stream().map(x -> Integer.toString(x.getId())).toList();
                if (new HashSet<>(itemTags).containsAll(filterTags)) {
                    output.add(item);
                }
            });
            return output;
        }

        return dbInfo;
    }
}
