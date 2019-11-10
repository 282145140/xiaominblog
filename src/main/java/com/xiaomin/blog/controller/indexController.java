package com.xiaomin.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: xiaomin
 * @Description:
 * @Date Created in 23:54 2019/10/30
 * @Modified By:
 */
@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/{id}/{name}")
    public String indexLog(@PathVariable Integer id,@PathVariable String name){
        System.out.println("-------------index----------------");
        return "index";
    }
}