package com.example.springjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {
        @Autowired
    ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SampleService service = ctx.getBean(SampleService.class);
        service.displayRedSamples();
        service.displayFirstSample();
    }
}
