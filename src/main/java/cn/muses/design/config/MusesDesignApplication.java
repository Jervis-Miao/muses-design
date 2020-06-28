/*
Copyright 2019 All rights reserved.
 */

package cn.muses.design.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jervis
 * @date 2020/6/7.
 */
@SpringBootApplication
@ComponentScan("cn.muses.design")
public class MusesDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusesDesignApplication.class);
    }
}
