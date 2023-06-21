package com.clovestranger.clove_blog.service.impl;

import com.clovestranger.clove_blog.dao.CommentMapper;
import com.clovestranger.clove_blog.model.Comment;
import com.clovestranger.clove_blog.service.CommentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    @ResponseBody
    public void addComment(Comment comment) {
        comment.setCommentId(String.valueOf(UUID.randomUUID()));
        commentMapper.addComment(comment);
    }

    @Override
    @ResponseBody
    public void delComment(String commentId) {
        commentMapper.delComment(commentId);
    }

    @Override
    @ResponseBody
    public void updateComment(Comment comment) {
        commentMapper.updateComment(comment);
    }

    @Override
    @ResponseBody
    public List<Comment> getComment(String resourceId) {
        return commentMapper.getComment(resourceId);
    }

}
