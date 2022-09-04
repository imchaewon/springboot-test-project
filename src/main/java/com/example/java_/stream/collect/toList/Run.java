package com.example.java_.stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		List<String> list = Arrays.asList("aaa","ccc","bbb");

//		List<String> sList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		list.stream().map(s->s.toUpperCase()).sorted().collect(Collectors.toList()).forEach(System.out::println);

//		System.out.println(sList);
	}
}
