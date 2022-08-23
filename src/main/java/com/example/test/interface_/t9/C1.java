package com.example.test.interface_.t9;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C1 {
	private Inter<JsonNode> inter;
	private static final ObjectMapper objectMapper = null;;

	void c1m1(){
		JsonNode jsonNode = inter.m1();
		System.out.println(asPrettyJson(jsonNode));
	}

	public static void main(String[] args) {
		C1 c = new C1();
		c.c1m1();
	}
}
