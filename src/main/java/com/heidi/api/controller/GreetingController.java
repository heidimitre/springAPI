package com.heidi.api.controller;

import com.heidi.api.dto.Greeting;
import com.heidi.api.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/hello")
    public Greeting hello(@RequestParam("name") String name){
        return greetingService.createGreeting(name);
    }
}
