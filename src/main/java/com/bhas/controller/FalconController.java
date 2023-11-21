package com.bhas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FalconController
{
    @GetMapping
    public String greetMsg()
    {
        System.out.println("\n*************\n");
        return "Welcome to the Falcon Applications!,";
    }

    @GetMapping("/getName/{name}")
    @ResponseStatus(code = HttpStatus.TOO_MANY_REQUESTS)
    public String getName(String name)
    {
        System.out.println("\n*************\n");
        return "Hello "+name;
    }
}
