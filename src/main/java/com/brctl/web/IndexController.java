package com.brctl.web;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by duanxiaoxing on 16/11/25.
 */
@Controller
public class IndexController {

    /*
    @RequestMapping("/")
    public HttpEntity<String> index() {
        return new ResponseEntity<>("Hello, World.", HttpStatus.OK);
    }
    */


    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
