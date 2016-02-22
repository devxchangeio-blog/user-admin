package org.oneclicklabs.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by karthy on 1/26/16.
 */
@SpringBootApplication(scanBasePackages="org.oneclicklabs.springboot")
public class Application {

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
    }
}
