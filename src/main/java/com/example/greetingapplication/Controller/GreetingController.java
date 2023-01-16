package com.example.greetingapplication.Controller;

import com.example.greetingapplication.Model.Greeting;
import com.example.greetingapplication.Service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private static final String template = "Hello, %s";
    private IGreetingService iGreetingService;
    private final AtomicLong counter= new AtomicLong();
    public GreetingController(IGreetingService iGreetingService){
        this.iGreetingService=iGreetingService;
    }

    @GetMapping("/")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }

    @GetMapping("/greeting")
    public String greeting(){
        return  iGreetingService.getGreetingMessage();
    }

}
