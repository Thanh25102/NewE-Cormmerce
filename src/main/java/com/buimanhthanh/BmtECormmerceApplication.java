package com.buimanhthanh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EntityScan({"com.buimanhthanh.entity"})
public class BmtECormmerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmtECormmerceApplication.class, args);
    }

}
