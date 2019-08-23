package com.cgx.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chenguoxin
 * @Date: 2019/8/22 10:45
 * @Description:
 */
@RestController
@RequestMapping("helloFeign")
public class HelloFeignController {

    @GetMapping(value = "word")
    public String getWord(String word){
        return  "helloFeign  "+word;
    }
}
