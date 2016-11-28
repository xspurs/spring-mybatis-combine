package com.brctl.dao;

import com.brctl.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
public interface ArticleMapper {

    // 根据文章ID查询文章
    Article findById(String id);


    // 查询全部文章
    List<Article> findAll();
}
