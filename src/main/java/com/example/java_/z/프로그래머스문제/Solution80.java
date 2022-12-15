package com.example.java_.z.프로그래머스문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//소인수분해
//소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
// 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution80 {
	public static void main(String[] args) {
		Solution80 s = new Solution80();
		System.out.println(Arrays.toString(s.solution(12)));
	}

	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= n; i++)
			while (n % i == 0){
				n /= i;
				list.add(i);
			}
		return list.stream().distinct().mapToInt(Integer::intValue).toArray();
	}

	public int[] solution2(int n) {
		return IntStream.range(2,n).filter(i -> n % i == 0).toArray();
	}


}
