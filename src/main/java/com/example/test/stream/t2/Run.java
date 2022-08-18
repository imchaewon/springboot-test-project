package com.example.test.stream.t2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		List<Integer> list = Arrays.asList(1,2,666,12,5);

//		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		int[] list2 = {1,512,1,12,5};

		System.out.println(Arrays.stream(list2).sorted().boxed().collect(Collectors.toList()));
		System.out.println(Arrays.stream(list2).count());
		System.out.println(Arrays.stream(list2, 1, 2).boxed().collect(Collectors.toList()));
		System.out.println(list.stream().limit(3).collect(Collectors.toList()));
		System.out.println(list.stream().skip(2).collect(Collectors.toList()));
		System.out.println(list.stream().max(Integer::compare).get());
		System.out.println(list.stream().min(Integer::compare).get());
		System.out.println(list.stream()
				.mapToDouble(Integer::doubleValue)
				.average()
				.getAsDouble());
		System.out.println(list.stream()
				.mapToInt(Integer::intValue)
				.sum());
		System.out.println(list.stream().skip(2).count());
		System.out.println(list.stream().findFirst().get());
		System.out.println(list.stream().skip(list.size() - 1).findFirst().get());

		list.stream().map(null);
	}
}
