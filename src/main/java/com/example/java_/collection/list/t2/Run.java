package com.example.java_.collection.list.t2;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list2 = new ArrayList<>(list);
		List<Integer> list3 = new ArrayList<>(Arrays.asList(6,7,8));

		try {
			list.add(4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		list2.add(5);
		list3.add(6);

		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);

	}
}
