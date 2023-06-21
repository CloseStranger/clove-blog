package com.clovestranger.clove_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloveBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloveBlogApplication.class, args);
    }
}
