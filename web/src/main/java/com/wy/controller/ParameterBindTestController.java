package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ParameterBind")
public class ParameterBindTestController {
    @ResponseBody
    @RequestMapping("/test1")
    public String test1(int id){
        System.out.println(id);
        return "test1";
    }

    @ResponseBody
    @RequestMapping("/test2")
    public String test2(User u){
        System.out.println(u.toString());
        return "test2";
    }

    @ResponseBody
    @RequestMapping("/test3/{id}")
    public String test2(@PathVariable("id") int id){
        System.out.println(id);
        return "test3";
    }
}
