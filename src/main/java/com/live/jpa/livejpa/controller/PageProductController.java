package com.live.jpa.livejpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageProductController {

    @GetMapping("/product")
    public String hello(@RequestParam(value = "name", defaultValue = "unknown", required = true) String name,String id, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "product";
    }
}
