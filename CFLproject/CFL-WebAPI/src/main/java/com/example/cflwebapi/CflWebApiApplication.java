package com.example.cflwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.example.*"})
public class CflWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CflWebApiApplication.class, args);
    }

}
