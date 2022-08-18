package com.example.test.stream.reduction.parallel.minus;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}


		System.out.println(list.stream().reduce(0, (i, j) -> i - j));
		// 1-2-3-4-5-6...

		System.out.println(list.stream().parallel().reduce(0, (i, j) -> i - j));
		// (1-2)-(3-4)-(5-6)...

		System.out.println(list.stream().parallel().reduce(0, (i, j) -> i - j, Integer::sum));


	}
}
