package com.example.java_.stream.reduction.parallel.minus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Run {
	public static void main(String[] args) {

		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

		System.out.println(list.stream().reduce(0, (i, j) -> i - j));
		// -1-2-3-4-5-6...

		System.out.println(list.stream().parallel().reduce(0, (i, j) -> i - j));
		// -1-2--3-4--5-6... → -1-2+3-4+5-6...

		System.out.println(list.stream().parallel().reduce(0, (i, j) -> i - j, (k, l) -> k - l));
		// (1-2)+(-3-4)+(-5-6)...

		System.out.println(list.stream().parallel().reduce(0, (i, j) -> i - j, Integer::sum));

	}
}
