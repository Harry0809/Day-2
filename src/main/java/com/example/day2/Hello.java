package com.example.day2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    //UC1_UsingGet

    @GetMapping("/hello")
    public String hello() {
        return "Hello From Bridgelabz";
    }

    //UC2_UsingQuery

    @GetMapping(value="/query")
    public String hello(@RequestParam (value="name") String name){
        return "hello" + name;
    }

    //Uc3_UsingParameter

    @GetMapping(value="/param/{name}")
    public String helloParam(@PathVariable String name){
        return "hello" + name;
    }


}


