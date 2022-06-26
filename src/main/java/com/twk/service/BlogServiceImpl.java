package com.twk.service;

import com.twk.pojo.Blog;

import java.util.Random;

public class BlogServiceImpl implements BlogService{
    @Override
    public Blog findBlogById(Integer id) {
        Blog blog = Blog.builder().id(id).userId(new Random().nextInt(100)).title("我的博客").build();
        System.out.println("客户端查询了id为 " + id + "的博客");
        return blog;
    }
}
