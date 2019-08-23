package com.cgx.springcloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: chenguoxin
 * @Date: 2019/8/22 11:18
 * @Description:
 */
@FeignClient(name = "eureka-provider",decode404 = true,url = "http://localhost:7002/eureka-provider")
public interface HelloFeignApi {

    @GetMapping(value = "helloFeign/word")
    public String getWord(@RequestParam("word") String word);
}
