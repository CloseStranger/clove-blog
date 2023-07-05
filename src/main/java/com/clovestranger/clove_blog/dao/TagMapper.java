package com.clovestranger.clove_blog.dao;

import com.clovestranger.clove_blog.model.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {
    void addTag(Tag tag);

    void delTag(int[] tagIds);

    void updateTag(Tag tag);

    List<Tag> tagList();
}
