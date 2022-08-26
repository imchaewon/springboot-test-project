package com.example.test.collection.list.t4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		Integer[] arr = {1,2,3,4};
		List<Integer> list = Arrays.asList(arr);

		List<Integer> list2 = new ArrayList<>(list);

		System.out.println(list2);
		list2.add(5);

		List<Integer> list3 = new ArrayList<>();
		list3.add(0);

		list3.addAll(list);

		System.out.println(list3);

	}
}
