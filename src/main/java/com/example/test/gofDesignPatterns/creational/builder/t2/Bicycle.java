package com.example.test.gofDesignPatterns.creational.builder.t2;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Bicycle {
	String company;
	int wheel;
	int price;

}
