package com.brctl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index Controller
 * @author Xitongjiagoushi
 * @created 2017/12/8
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
