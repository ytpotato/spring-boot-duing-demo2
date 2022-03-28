package com.duing.controller;

import com.duing.config.FoodConfig;
import com.duing.config.VegetablesConfig;
import com.duing.domian.Food;
import com.duing.domian.Greeting;
import com.duing.domian.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    @GetMapping("/food")
    public Food food(){
        return new Food(rice,meat);
    }

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/info")
    public String info(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(username);
        buffer.append("\t");
        buffer.append(password);
        return buffer.toString();
    }


    @Autowired
    private FoodConfig foodConfig;

    @GetMapping("/food2")
    public Food food2(){
        return new Food(foodConfig.getRice(),foodConfig.getMeat());
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @GetMapping("/vegetables")
    public Vegetables vegetables(){
        return new Vegetables(vegetablesConfig.getPotato(),vegetablesConfig.getGreenpeper(),vegetablesConfig.getEggplant());
    }
}
