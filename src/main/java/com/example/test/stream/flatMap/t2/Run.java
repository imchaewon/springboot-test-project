package com.example.test.stream.flatMap.t2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
	public static void main(String[] args) {

		List<C1> list = Arrays.asList(
			new C1(1, Arrays.asList(new C2("aa")))
		);

		List<C2> changeList = list.stream()
		.flatMap(item -> item.getBbbbb().stream())
		.collect(Collectors.toList());

		System.out.println(list);
		System.out.println(changeList);

	}
}
