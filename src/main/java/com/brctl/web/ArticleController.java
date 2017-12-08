package com.brctl.web;

import com.brctl.domain.Article;
import com.brctl.service.IArticleService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Article Controller
 * @author Xitongjiagoushi
 * @created 2017/12/8
 */
@Controller
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public HttpEntity<Article> requestArticleById(@PathVariable String id) {
        log.info("==========根据查询文章，id: {}==========", id);
        Article article = articleService.findById(id);
        return new ResponseEntity<>(article, HttpStatus.OK);
    }

    @RequestMapping(value = "/all")
    @ResponseBody
    public HttpEntity<List<Article>> requestAllArticles() {
        log.info("==========查询全部文章==========");
        List<Article> articles = articleService.findAll();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }
}
