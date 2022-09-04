package com.example.java_.collection.list.t7;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		System.out.println(list1);

		List<Integer> list2 = list1;

		System.out.println(list2);

		list2.add(4);
		list1.add(5);

		System.out.println(list1);
		System.out.println(list2);




	}
}
