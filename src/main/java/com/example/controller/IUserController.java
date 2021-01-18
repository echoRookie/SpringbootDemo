package com.example.controller;

import com.example.entity.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class IUserController {
    @Autowired
    IUserService iUserService;


    @RequestMapping("/login")
    @ResponseBody
    public String show(){
        User user=  iUserService.findUserById(1);
        return user.person_name;
    }

}
