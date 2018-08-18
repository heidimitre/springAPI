package com.heidi.api.services.impl;

import com.heidi.api.dto.Greeting;
import com.heidi.api.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public Greeting createGreeting(String name){
        String[] greetings = {"Hello", "Hi", "Hola", "Bienvenidos", "Sup"};
        int value = (int)(Math.random() * 5);
        Greeting greeting = new Greeting(greetings[value], name);
        return greeting;
    }
}
