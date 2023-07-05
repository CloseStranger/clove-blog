package com.clovestranger.clove_blog.service.impl;

import com.clovestranger.clove_blog.dao.TagMapper;
import com.clovestranger.clove_blog.model.Tag;
import com.clovestranger.clove_blog.service.TagService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
 
@Service
public class TagServiceImpl implements TagService {

    @Resource
    private TagMapper tagMapper;

    @Override
    @ResponseBody
    public void addTag(Tag tag) {
        tagMapper.addTag(tag);
    }

    @Override
    @ResponseBody
    public void delTag(int[] tagIds) {
        tagMapper.delTag(tagIds);
    }

    @Override
    @ResponseBody
    public void updateTag(Tag tag) {
        tagMapper.updateTag(tag);
    }

    @Override
    @ResponseBody
    public List<Tag> tagList() {
        return tagMapper.tagList();
    }
}
