package com.adrian2316.springarchitecture;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SpringConfigurationProperties.class)
public class SpringConfiguration {

    // Add specific use-case objects to the application context.
}
