package com.brctl.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


/**
 * 单元测试类
 * Created by duanxiaoxing on 16/11/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml", "classpath:spring-mvc-config.xml"})
public class ArticleTester {

    private SqlSessionFactory sqlSessionFactory;
    private final static Logger logger = LoggerFactory.getLogger(ArticleTester.class);

    @Before
    public void preHandler() throws FileNotFoundException {
        logger.info("========== Pre Handler Starts... ==========");
        InputStream is = new FileInputStream(new File("src/main/resources/mybatis-config.xml"));
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = builder.build(is);
    }


    @Test
    public void test() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //sqlSession.select("select * from ");
    }
}
