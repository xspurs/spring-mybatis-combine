package com.brctl.dao;

import com.brctl.domain.Article;

import java.util.List;

/**
 * Article Mapper
 * @author Xitongjiagoushi
 * @created 2017/12/8
 */
public interface ArticleMapper {

    // 根据文章ID查询文章
    Article findById(String id);


    // 查询全部文章
    List<Article> findAll();
}
