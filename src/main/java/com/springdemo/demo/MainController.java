package com.springdemo.demo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class MainController {

    @RequestMapping(value = "/test")
    public User test(ModelMap map) {
        User u = new User();
        u.setName("张三");
        u.setAge(23);
        u.setPassword("123456");
        u.setSex("男");
        u.setBirthday(new Date());
        map.addAttribute("user",u);
        return u;
    }

    @RequestMapping("/index")
    public String index(){
        return "index page!";
    }
}

    