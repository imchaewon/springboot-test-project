package com.example.java_.z.프로그래머스문제;

import java.util.Arrays;
import java.util.OptionalDouble;

// 평균
public class Solution2 {
	public double solution(int[] arr) {
		double answer = 0;


		OptionalDouble o = Arrays.stream(arr).average();
		if(o.isPresent())
			answer = o.getAsDouble();

		return answer;
	}

	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();

		System.out.println(solution2.solution(new int[]{1, 2, 3, 4, 5}));

	}
}
