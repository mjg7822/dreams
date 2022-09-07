package com.daekyo.dreams.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "test");
        return "greeting";
    }

}
