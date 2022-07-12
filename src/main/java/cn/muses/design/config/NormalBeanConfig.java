/**
 * Copyright 2022 XYZ Co., Ltd. All Rights Reserved
 */
package cn.muses.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.muses.utils.json.JsonMapper;
import cn.muses.utils.spring.SpringContextUtils;

/**
 * @author jervis
 * @date 2022/7/12.
 */
@Configuration
public class NormalBeanConfig {

    @Bean("springContextUtils")
    public SpringContextUtils initSpringContextUtils() {
        return new SpringContextUtils();
    }

    @Bean
    @Primary
    public JsonMapper initJsonMapper(ObjectMapper objectMapper) {
        return new JsonMapper(objectMapper);
    }
}
