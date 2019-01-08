package com.codeup.matthew.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class MathController {

//    @GetMapping("/add/{num1}/and/{num2}")
//    public int add(@PathVariable int num1, @PathVariable int num2){
//        return num1 + num2;
//    }
//
//    @GetMapping("/subtract/{num1}/from/{num2}")
//    public int subtract(@PathVariable int num1, @PathVariable int num2){
//        return num1 - num2;
//    }
//
//    @GetMapping("/multiply/{num1}/and/{num2}")
//    public int multiply(@PathVariable int num1, @PathVariable int num2){
//        return num1 * num2;
//    }
//
//    @GetMapping("/divide/{num1}/by/{num2}")
//    public int divide(@PathVariable int num1, @PathVariable int num2){
//        return num1 / num2;
//    }

    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rolledDicePage(@PathVariable int n, Model model){
        int randomNum = (int)(Math.random() * 6 + 1);
        model.addAttribute("randomNum", randomNum);
        model.addAttribute("guess", n);

        if (randomNum == n){
            model.addAttribute("equal", true);
        } else {
            model.addAttribute("equal", false);
        }
        return "roll-dice-n";
    }

}
