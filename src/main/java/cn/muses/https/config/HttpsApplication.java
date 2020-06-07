/*
Copyright 2019 All rights reserved.
 */

package cn.muses.https.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jervis
 * @date 2020/6/7.
 */
@SpringBootApplication
@ComponentScan("cn.muses.https")
public class HttpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpsApplication.class);
    }
}
