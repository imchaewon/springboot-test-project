package com.example.java_.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonUtil {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}