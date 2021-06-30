package com.nivtek.dockerdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DockerDemoController {

    @Value("${my-prop}")
    private String myProp;

    @GetMapping("/time")
    public String getTimeNow() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return "Now:" + now.toString();

    }

    @PostMapping("/hello")
    public String getMessageWithName(@RequestBody String name) {

        return "your name is " + name;
    }

    @GetMapping("/myprop")
    public String getProperty() {
        return myProp;
    }

}
