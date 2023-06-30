package com.clovestranger.clove_blog.controller;

import com.clovestranger.clove_blog.common.CommonResult;
import com.clovestranger.clove_blog.model.Comment;
import com.clovestranger.clove_blog.service.CommentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void delComment(@RequestParam(value = "commentId") String commentId) {
        commentService.delComment(commentId);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Comment>> getComment(@RequestParam(value = "resourceId") String resourceId) {
        List<Comment> list = commentService.getComment(resourceId);
        return CommonResult.success(list);
    }
}
