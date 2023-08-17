package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean(name = "consoleEventLogger")
    public ConsoleEventLogger consoleEventLogger() {
        return new ConsoleEventLogger();
    }
}
