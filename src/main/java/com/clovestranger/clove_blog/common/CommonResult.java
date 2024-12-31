package com.clovestranger.clove_blog.common;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CommonResult<T> { 
    private long code;

    private String message;

    private T data;

    protected CommonResult() {
    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(200, "OK", data);
    }

    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(200, message, data);
    }
}
