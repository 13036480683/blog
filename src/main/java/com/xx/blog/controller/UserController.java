package com.xx.blog.controller;

import com.xx.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String LoginIn(String name, String psw, Map<String,Object> map, HttpSession session) {
        if (name.equals("123")&&psw.equals("123")) {

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
        return "error";
    }

    @GetMapping("/index")
    public String Index(){
        return "index";
    }
}
