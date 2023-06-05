package com.clovestranger.clove_blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {
    private String resId;
    private String content;
    private long createTime;
    private long updateTime;
}
