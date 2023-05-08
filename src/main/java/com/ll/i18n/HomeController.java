package com.ll.i18n;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String showMain() {
        return "main";
    }
}
