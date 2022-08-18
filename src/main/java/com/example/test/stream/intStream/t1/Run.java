package com.example.test.stream.intStream.t1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Run {
	public static void main(String[] args) {

		// IntStream 생성
		IntStream is1 = IntStream.of(1,2,3,4,5); // 1,2,3,4,5
		IntStream is2 = IntStream.range(1,5); // 1,2,3,4
		IntStream is3 = IntStream.rangeClosed(1,5); // 1,2,3,4,5

		System.out.println(is1.boxed().collect(Collectors.toList()));
		System.out.println(is2.boxed().collect(Collectors.toList()));
		System.out.println(is3.boxed().collect(Collectors.toList()));

		// iterate 함수
		IntStream is4 = IntStream.iterate(0,i -> i + 2).limit(4); // 0,2,4,6. 4는 4개의 요소라는 의미
		System.out.println(is4.boxed().collect(Collectors.toList()));

		// anyMatch 함수
		boolean b1 = IntStream.range(1,5).anyMatch(i -> i % 2 == 0); // true. 1,2,3,4 모두가 짝수면 참
		System.out.println(b1);

		// allMatch 함수
		boolean b2 = IntStream.range(1,5).allMatch(i -> i % 2 == 0); // false. 1,2,3,4 모두가 짝수면 참
		System.out.println(b2);

		// noneMatch 함수
		boolean b3 = IntStream.range(1,5).noneMatch(i -> i % 2 == 0); // flase. 1,2,3,4 모두가 짝수가 아니면 참
		System.out.println(b3);

		// filter 함수
		IntStream is5 = IntStream.range(1,5).filter(i -> i % 2 == 1); // 1,3
		boolean b4 = IntStream.range(1,5).filter(i -> i % 2 == 1).anyMatch(i -> i % 2 == 1); // true
		boolean b5 = IntStream.range(1,5).filter(i -> i % 2 == 1).noneMatch(i -> i % 2 == 1); // flase
		System.out.println(is5.boxed().collect(Collectors.toList()));
		System.out.println(b4);
		System.out.println(b5);

		// max, min 함수
		IntStream.range(1,5).max().ifPresent(System.out::println);
		IntStream.range(1,5).min().ifPresent(System.out::println);


	}
}





