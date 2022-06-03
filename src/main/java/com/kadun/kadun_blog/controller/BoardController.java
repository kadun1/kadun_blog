package com.kadun.kadun_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hi", "하이");
        return "index";
    }

}
