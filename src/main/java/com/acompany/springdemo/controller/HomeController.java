package com.acompany.springdemo.controller;

import com.acompany.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public Map<String, String> Home() {
        Map<String, String> res = this.userService.getMessage();
        return res;
    }
}
