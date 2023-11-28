package com.upc.chasisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChasisServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChasisServiceApplication.class, args);

        String url = "http://localhost:8090/swagger-ui.html";
        System.out.println("\n• Swagger UI is available at » " + url);
    }

}