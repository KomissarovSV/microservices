package com.myservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyServiceApplication {

    @Value("${field1}")
    private String field1;

    public static void main(String[] args) {
        SpringApplication.run(MyServiceApplication.class);
    }

    @RequestMapping
    public String getField1(){
        return field1;
    }
}
