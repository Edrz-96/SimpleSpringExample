package com.qa.demo.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public String time() {
		return "Application started: " + LocalTime.now();
	}

	
}