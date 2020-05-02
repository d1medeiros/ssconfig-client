package com.example.ssconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SsconfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsconfigClientApplication.class, args);
    }
}

@RestController
class Controller {

    @GetMapping("info")
    public String info(@Value("${api.friend}") String apiFriend) {
        return apiFriend;
    }

}