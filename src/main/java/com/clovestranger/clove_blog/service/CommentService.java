package com.clovestranger.clove_blog.service;

import com.clovestranger.clove_blog.model.Comment;

import java.util.List;

public interface CommentService {
    void addComment(Comment comment);

    void delComment(String commentId);

    void updateComment(Comment comment);

    List<Comment> getComment(String resourceId);
}
