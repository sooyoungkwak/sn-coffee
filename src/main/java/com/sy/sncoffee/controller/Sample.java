package com.sy.sncoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample {

    @GetMapping("/")
    public String index() {
        return "main";
    }
}
