package com.learning.corejava.controller;

import com.learning.corejava.dto.Calculator;
import com.learning.corejava.service.CoreJavaPrograms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class CoreJavaController {


    @Autowired
    CoreJavaPrograms coreJavaPrograms;


    @RequestMapping("/hello")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/check/prime/{number}")
    public String checkPrime(@PathVariable("number") int number){
        return  coreJavaPrograms.checkPrime(number);
    }

    @RequestMapping("/calculator")
    public int checkPrime(@RequestBody Calculator calculator){
        return  coreJavaPrograms.performOperation(calculator);
    }
}
