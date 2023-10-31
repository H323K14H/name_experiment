package com.bnta.name_experiment.controllers;

import com.bnta.name_experiment.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting") //localhost:8080/greeting
    public Greeting greeting() {
        return new Greeting("Faiz");
    }

}
