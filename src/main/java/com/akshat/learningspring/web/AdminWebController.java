package com.akshat.learningspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminWebController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}
