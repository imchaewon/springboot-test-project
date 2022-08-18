package com.example.test.stream.upperCase;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
    	ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Melon","Grape","Strawberry"));

//    	list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    	list.stream().map(String::toUpperCase).forEach(System.out::println);

//    	System.out.println(list);

	}
}
