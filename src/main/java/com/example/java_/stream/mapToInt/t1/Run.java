package com.example.java_.stream.mapToInt.t1;

import java.util.Arrays;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);

		int i1 = list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println(i1);



	}
}
