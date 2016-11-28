package com.brctl.dao;

import com.brctl.domain.Article;
import org.springframework.stereotype.Repository;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
public interface ArticleMapper {

    // 根据ID查询文章信息
    Article findById(String id);
}
