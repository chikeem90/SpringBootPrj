package io.chikeem90.springapplicationtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringapplicationtestApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringapplicationtestApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
