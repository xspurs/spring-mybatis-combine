package com.brctl.domain;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Article Bean
 * @author Xitongjiagoushi
 * @created 2017/12/8
 */
@Data
public class Article implements java.io.Serializable {

    private String id;  // ID
    private String title;  // 题目
    // 由于abstract为Java中的关键字，所以在此以abstractContent代替数据表中的abstract列，在Mapper.xml中需要对此进行处理
    private String abstractContent;  // 摘要
    private String content;  // 内容
    private String author;  // 作者
    // 在mybatis-config.xml配置文件中，通过开启mapUnderscoreToCamelCase，可以将下划线命名自动转换为驼峰命名
    private Timestamp createTime;  // 创建时间
    private String type;  // 类型
    private String deleteFlag;  // 删除标记

}
