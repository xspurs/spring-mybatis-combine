package com.brctl.domain;

import java.sql.Timestamp;

/**
 * 博客实体类
 * Created by duanxiaoxing on 16/11/25.
 */
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

    /*
        getters & setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstractContent() {
        return abstractContent;
    }

    public void setAbstractContent(String abstractContent) {
        this.abstractContent = abstractContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
