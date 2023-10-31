package com.bnta.name_experiment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting") //localhost:8080/greeting
    public String greeting(@RequestParam(defaultValue = "Human!") String name){
        return "Good afternoon, " + name;
    }

}
