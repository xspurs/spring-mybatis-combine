package com.brctl.web;

import com.brctl.domain.Article;
import com.brctl.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public HttpEntity<Article> requestBlogById(@PathVariable String id) {
        Article article = articleService.findById(id);
        return new ResponseEntity<>(article, HttpStatus.OK);
    }
}
