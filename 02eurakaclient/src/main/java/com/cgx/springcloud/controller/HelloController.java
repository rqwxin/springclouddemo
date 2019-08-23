package com.cgx.springcloud.controller;

import com.cgx.springcloud.api.HelloFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chenguoxin
 * @Date: 2019/8/22 10:45
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private HelloFeignApi helloFeignApi;

    @GetMapping(value = "word")
    public String getWord(String word){
        return  "hello "+word;
    }

    @GetMapping(value = "feignword")
    public String feignword(String word){
        String word1 = helloFeignApi.getWord(word);
        return word1;
    }
}
