package github.brad.easy.a004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@SpringBootApplication
@Controller
public class WhatJavaCanDo02Application {

    public static void main(String[] args) {
        SpringApplication.run(WhatJavaCanDo02Application.class,args);
    }

    @RequestMapping("/time")
    public String time(){
        return new Date().toString();
    }
}
