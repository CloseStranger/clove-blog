package com.clovestranger.clove_blog.service;

import com.clovestranger.clove_blog.model.Tag;

import java.util.List;

public interface TagService {
    void addTag(Tag tag);

    void delTag(int[] tagIds);

    void updateTag(Tag tag);

    List<Tag> tagList();
}
