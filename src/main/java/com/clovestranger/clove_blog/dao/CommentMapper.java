package com.clovestranger.clove_blog.dao;

import com.clovestranger.clove_blog.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    void addComment(Comment comment);

    void delComment(String commentId);

    void updateComment(Comment comment);

    List<Comment> getComment(String resourceId);
}
