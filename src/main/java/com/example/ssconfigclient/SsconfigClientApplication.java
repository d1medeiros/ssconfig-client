package com.example.ssconfigclient;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SsconfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsconfigClientApplication.class, args);
    }

}

@Configuration
@RequiredArgsConstructor
class Runner implements CommandLineRunner {

    @Value("${api.friend}")
    private String databaseInfo;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(databaseInfo);


    }
}

