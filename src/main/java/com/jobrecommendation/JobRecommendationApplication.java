package com.jobrecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JobRecommendationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobRecommendationApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
