package github.brad.easy.a004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class WhatJavaCanDo01Application {

    public static void main(String[] args) {
        SpringApplication.run(WhatJavaCanDo01Application.class,args);
    }

    @RequestMapping("/time")
    public String time(){
        return new Date().toString();
    }
    @RequestMapping("/int")
    public int intValue(){
        return 2020;
    }
    @RequestMapping("/double")
    public double doubleValue(){
        return 9.99;
    }
}
