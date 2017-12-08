package com.brctl.service;

import com.brctl.domain.Article;

import java.util.List;

/**
 * Article Service Interface
 * @author Xitongjiagoushi
 * @created 2017/12/8
 */
public interface IArticleService {

    Article findById(String id);

    List<Article> findAll();
}
