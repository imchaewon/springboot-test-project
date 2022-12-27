package com.example.java_.z.프로그래머스문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//
public class Solution94 {
	public static void main(String[] args) {
		Solution94 s = new Solution94();
		System.out.println(Arrays.toString(s.solution(new int[][]{{80, 70}, {90, 55}, {40, 70}, {40, 70}, {10, 10}})));
		System.out.println(Arrays.toString(s.solution2(new int[][]{{80, 70}, {90, 55}, {40, 70}, {40, 70}, {10, 10}})));
		System.out.println(Arrays.toString(s.solution3(new int[][]{{80, 70}, {90, 55}, {40, 70}, {40, 70}, {10, 10}})));
	}

	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		double[] arr = Arrays.stream(score).mapToDouble(i -> Arrays.stream(i).average().orElse(0)).toArray();
		int rank = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i] >= arr[j]){
					rank--;
				}
			}
			answer[i] = rank;
			rank = arr.length;
		}
		return answer;
	}

	public int[] solution2(int[][] score) {
		List<Integer> scoreList = new ArrayList<>();
		for(int[] t : score){
			scoreList.add(t[0] + t[1]);
		}
		scoreList.sort(Comparator.reverseOrder());

		int[] answer = new int[score.length];
		for(int i=0; i<score.length; i++){
			answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
		}
		return answer;
	}

	public int[] solution3(int[][] score) {
		return Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0))
				.mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(d) + 1).toArray();
	}
}










