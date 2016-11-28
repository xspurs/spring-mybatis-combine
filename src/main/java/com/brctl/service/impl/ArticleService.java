package com.brctl.service.impl;

import com.brctl.dao.ArticleMapper;
import com.brctl.domain.Article;
import com.brctl.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    @Override
    public Article findById(String id) {
        return this.articleMapper.findById(id);
    }

    @Override
    public List<Article> findAll() {
        return this.articleMapper.findAll();
    }

}
