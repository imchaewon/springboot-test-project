package com.example.java_.collection.list.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list2 = new ArrayList<>(list);

		System.out.println(list2);
		list2.add(4);
		System.out.println(list2);
	}
}
