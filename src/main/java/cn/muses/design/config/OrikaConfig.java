/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.muses.design.config.orika.MusesMapperFactoryConfigurer;
import cn.muses.design.config.orika.MusesOrikaMapperFactoryBuilderConfigurer;

/**
 * @author jervis
 * @date 2020/12/1.
 */
@Configuration
public class OrikaConfig {

    @Bean
    public MusesMapperFactoryConfigurer musesMapperFactoryConfigurer() {
        return new MusesMapperFactoryConfigurer();
    }

    @Bean
    public MusesOrikaMapperFactoryBuilderConfigurer orikaMapperFactoryBuilderConfigurer() {
        return new MusesOrikaMapperFactoryBuilderConfigurer();
    }
}
