package com.example.day2;

import org.springframework.web.bind.annotation.*;

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

    //UC4_PostMethod

    @PostMapping("/post")
    public String hello(@RequestBody User user){
        return "hello" + user.getFirstName()+ " " + user.getLastName();
    }


}


