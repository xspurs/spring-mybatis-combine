package com.brctl.dao;

import com.brctl.domain.Article;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
public interface IArticleDao {

    Article findById(String id);
}
