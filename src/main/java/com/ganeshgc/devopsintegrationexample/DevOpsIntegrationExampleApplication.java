package com.ganeshgc.devopsintegrationexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevOpsIntegrationExampleApplication {

    @GetMapping("/try")
    public String tryMethod() {
        return "devOps integration example for jenkins trial";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevOpsIntegrationExampleApplication.class, args);
    }

}
