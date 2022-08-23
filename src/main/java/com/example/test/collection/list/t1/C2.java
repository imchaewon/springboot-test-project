package com.example.test.collection.list.t1;

import java.util.ArrayList;
import java.util.List;

public class C2 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		System.out.println(list.isEmpty());
		System.out.println(list == null);
		System.out.println(list.toString().equals("[]"));

		list.add(1);

		System.out.println(list.isEmpty());
		System.out.println(list == null);

	}
}
