package com.batorus.restservicesecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestServicesSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServicesSecurityApplication.class, args);
    }

    @GetMapping("/secured")
    public String securedEntryPoint(){
        return "This is secured";
    }

    @GetMapping("/public")
    public String publicEntryPoint(){
        return "This is public";
    }

}
