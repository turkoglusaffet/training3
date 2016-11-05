package com.spring.training3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.spring.training3.*")

@PropertySource("classpath:info.properties")
public class AppInitConfig {
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolder() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
