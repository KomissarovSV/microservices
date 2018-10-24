package com.another.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnotherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherServiceApplication.class);
    }

    @RequestMapping("send")
    public String sendRequestToMyService(){
        return "value";
    }
}
