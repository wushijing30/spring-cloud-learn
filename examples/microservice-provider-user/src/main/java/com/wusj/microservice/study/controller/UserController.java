package com.wusj.microservice.study.controller;

import com.wusj.microservice.study.entity.User;
import com.wusj.microservice.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wusj on 2018/3/27.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User fineOne = this.userRepository.findOne(id);
       //User fineOne = new User();
        //fineOne.setId(101L);
        return fineOne;
    }
}
