package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
