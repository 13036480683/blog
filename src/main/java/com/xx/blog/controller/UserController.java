package com.xx.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.SecureRandom;
import java.util.Map;

@Controller
public class UserController {
    @PostMapping("/login")
    public String LoginIn(String name, String psw, Map<String,Object> map, HttpSession session) {
        if ("1".equals(name) && "1".equals(psw)) {
            ModelAndView mv = new ModelAndView("index");
            session.setAttribute("loginUser",name);
            return "redirect:/main";
        }
        map.put("msg","登录失败");
        return "login";
    }

    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    //    @RequestMapping("/404")
    @RequestMapping("/notFind")
    public String NotFind(Map<String, Object> map) {
        map.put("error", "您的页面不见了");
        return "notFind";
    }

    @GetMapping("/index")
    public String Index(){
        return "index";
    }
}
