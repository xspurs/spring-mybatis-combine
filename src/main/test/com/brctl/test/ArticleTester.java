package com.brctl.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 单元测试类
 * Created by duanxiaoxing on 16/11/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml", "classpath:spring-mvc-config.xml"})
public class ArticleTester {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void heihei() {

    }
}
