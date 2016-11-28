package com.brctl.service;

import com.brctl.domain.Article;

import java.util.List;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
public interface IArticleService {

    Article findById(String id);

    List<Article> findAll();
}
