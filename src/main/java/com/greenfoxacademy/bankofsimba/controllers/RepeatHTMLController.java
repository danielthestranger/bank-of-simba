package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RepeatHTMLController {

    @GetMapping("/repeat-html")
    public String repeatHtml(@RequestParam(value = "html", defaultValue = "") String html,
                             Model model) {
        model.addAttribute("html", html);
        return "repeat-html";
    }
}
