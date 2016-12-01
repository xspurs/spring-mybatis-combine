package com.brctl.test;

import com.brctl.domain.Article;
import com.brctl.service.IArticleService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 没有使用spring-test提供的注解的测试类
 * Created by duanxiaoxing on 16/12/1.
 */
public class ArticleNoSpringTestTester {

    private IArticleService articleService;

    @Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        // 通过Class类型的参数获取Bean
        articleService = ctx.getBean(IArticleService.class);
    }

    @Test
    public void test() {
        List<Article> articles = articleService.findAll();
        System.out.println();
        for(Article article: articles) {
            System.out.println(article.getAuthor());
        }
    }
}
