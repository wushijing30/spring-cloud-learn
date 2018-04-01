package com.wusj.microservice.study.user.controller;

import com.wusj.microservice.study.user.entity.User;
import com.wusj.microservice.study.user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wusj on 2018/3/31.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id){
        return this.userFeignClient.findById(id);
    }
}
