package com.clovestranger.clove_blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {
    private int id;
    private String articleResId;
    private String content;
    private List<Tag> tags;
    private Boolean hotContent;
    private Boolean vipContent;
    private Boolean visible;
    private String coverImg;
    private String contentSummary;
    private String[] category;
    private Timestamp createTime;
    private Timestamp updateTime;
}
