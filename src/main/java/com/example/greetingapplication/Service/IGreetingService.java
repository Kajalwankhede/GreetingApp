package com.example.greetingapplication.Service;

import com.example.greetingapplication.Model.Greeting;
import com.example.greetingapplication.Model.User;

import java.util.List;

public interface IGreetingService {
    String getGreetingMessage();
    String getGreetingMessage(User user);
    Greeting addGreetingMessage(User user);
    Greeting getGreetingMsgById(long id);
    List<Greeting> getAllGreetingMsg();
    Greeting updateGreetingMsg(long id,User user);
    Greeting deleteGreetingMsg(long id);
}
