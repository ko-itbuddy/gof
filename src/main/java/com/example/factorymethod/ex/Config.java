package com.example.factorymethod.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public String hello() {
		return "java world";
	}
}
