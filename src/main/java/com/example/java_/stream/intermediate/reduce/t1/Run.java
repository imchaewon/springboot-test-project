package com.example.java_.stream.intermediate.reduce.t1;

import java.util.stream.Stream;

public class Run {
	public static void main(String[] args) {

		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
		int sum = numbers.reduce(10, Integer::sum);
		System.out.println(sum);

	}
}
