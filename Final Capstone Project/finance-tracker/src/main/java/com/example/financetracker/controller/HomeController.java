package com.example.financetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // FIRST PAGE → LOGIN
        return "redirect:/login.html";
    }
}
