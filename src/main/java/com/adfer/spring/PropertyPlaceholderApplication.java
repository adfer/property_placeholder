package com.adfer.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class PropertyPlaceholderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyPlaceholderApplication.class, args);

	}
}
