package com.codeup.matthew.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    public int add(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    public int subtract(@PathVariable int num1, @PathVariable int num2){
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    public int multiply(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    public int divide(@PathVariable int num1, @PathVariable int num2){
        return num1 / num2;
    }

}
