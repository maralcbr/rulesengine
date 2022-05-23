package com.company.rulesengine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/rules")
    public String index() {
        return "Rules!";
    }

}