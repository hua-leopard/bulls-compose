package com.industrial.bulls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleManager {


    @RequestMapping(path = "/index")
    public String index(){
        return "hello worlds";
    }
}
