package com.example.java_.ramda.t2;

// λ μ λΉκ΅
public class Run {
	public static void main(String[] args) {
		Mynumber max = (x,y) -> x >= y ? x : y;
		System.out.println(max.getMax(10, 40));
	}
}
