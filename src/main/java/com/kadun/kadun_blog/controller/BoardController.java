package com.kadun.kadun_blog.controller;

import com.kadun.kadun_blog.dto.PostSaveDto;
import com.kadun.kadun_blog.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BoardController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hi", "하이");
        return "index";
    }

}
