package com.jacobcadena.didemo.controllers;

import com.jacobcadena.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello - My Controller");

        return greetingService.sayGreeting();
    }
}
