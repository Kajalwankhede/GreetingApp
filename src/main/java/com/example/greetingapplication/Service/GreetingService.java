package com.example.greetingapplication.Service;

import org.springframework.stereotype.Service;

@Service
    public class GreetingService implements IGreetingService{

        public String getGreetingMessage(){
            return "Hello World!";
        }
    }
