package com.example.singleton.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public String hello() {
		return "world!";
	}
}
