package com.example.greetingapplication.Service;

import com.example.greetingapplication.Model.Greeting;
import com.example.greetingapplication.Model.User;

public interface IGreetingService {
    String getGreetingMessage();
    String getGreetingMessage(User user);
    Greeting addGreetingMessage(User user);
}
