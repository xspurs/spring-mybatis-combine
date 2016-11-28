package com.brctl.service.impl;

import com.brctl.dao.IArticleDao;
import com.brctl.domain.Article;
import com.brctl.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
@Service
public class ArticleService implements IArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Override
    public Article findById(String id) {
        return this.articleDao.findById(id);
    }
}
