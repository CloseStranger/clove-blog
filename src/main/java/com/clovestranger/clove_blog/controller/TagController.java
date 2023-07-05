package com.clovestranger.clove_blog.controller;


import com.clovestranger.clove_blog.common.CommonResult;
import com.clovestranger.clove_blog.model.Tag;
import com.clovestranger.clove_blog.service.TagService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Resource
    private TagService tagService;

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    @ResponseBody
    public void addTag(Tag tag) {
        tagService.addTag(tag);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void delTag(int[] tagIds) {
        tagService.delTag(tagIds);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void updateTag(Tag tag) {
        tagService.updateTag(tag);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Tag>> tagList() {
        return CommonResult.success(tagService.tagList());
    }
}
