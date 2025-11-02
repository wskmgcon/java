package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocController {

    @GetMapping("/book")
    public String responseEntity()
    {
        return "Hello from Service 1";
    }

}

