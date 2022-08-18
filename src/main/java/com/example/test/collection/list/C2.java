package com.example.test.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list2 = new ArrayList<>(list);

		System.out.println(list2);
		list2.add(4);
		System.out.println(list2);
	}
}
