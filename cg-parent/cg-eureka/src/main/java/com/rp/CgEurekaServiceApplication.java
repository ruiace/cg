package com.rp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author rp
 */
@SpringBootApplication
@EnableEurekaServer
public class CgEurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CgEurekaServiceApplication.class,args);
    }
}
