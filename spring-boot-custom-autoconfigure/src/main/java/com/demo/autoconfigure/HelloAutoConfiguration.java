package com.demo.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloApplicationRunner.class)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloApplicationRunner.class)
    @ConditionalOnProperty(name = "hello.enabled", havingValue = "true", matchIfMissing = true)
    public HelloApplicationRunner greetingApplicationRunner() {
        return new HelloApplicationRunner();
    }
}
