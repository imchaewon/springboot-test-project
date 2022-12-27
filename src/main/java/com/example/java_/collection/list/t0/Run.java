package com.example.java_.collection.list.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(){
			{
				add(1);
				add(2);
				add(3);
			}
		};
		List<Integer> list2 = Arrays.asList(1,2,3);
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));

		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);

	}
}
