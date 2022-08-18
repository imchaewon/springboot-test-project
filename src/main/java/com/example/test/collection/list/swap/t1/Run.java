package com.example.test.collection.list.swap.t1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("가","나","다","라","마");

		System.out.println(list);

		Collections.swap(list,3,1);

		System.out.println(list);

	}
}
