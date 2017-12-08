package com.brctl.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 抽象测试类<br/>
 * 其余测试类继承该类，可不用加载spring xml配置信息
 * @author Xitongjiagoushi
 * @created 2017/12/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public abstract class AbstractTest {
}
