package com.example.test.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list2 = list.stream().collect(Collectors.toList());

		System.out.println(list2);
		list2.add(4);
		System.out.println(list2);
	}
}
