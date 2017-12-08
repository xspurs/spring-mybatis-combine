package com.brctl.test;

import com.brctl.domain.Article;
import com.brctl.service.IArticleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * 单元测试类
 * @author Xitongjiagoushi
 * @created 2017/12/8
 */
@Slf4j
public class ArticleTest extends AbstractTest {

    @Autowired
    private IArticleService articleService;


    @Test
    public void testFindAll() {
        List<Article> articles = articleService.findAll();
        for(Article article: articles) {
            log.info("article author: {}", article.getAuthor());
        }
    }

}
