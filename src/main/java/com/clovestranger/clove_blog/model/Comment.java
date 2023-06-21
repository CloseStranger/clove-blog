package com.clovestranger.clove_blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment {
    private String resourceId;
    private String commentId;
    private String commentContent;
    private String commentUserName;
}
