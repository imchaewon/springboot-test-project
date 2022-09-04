package com.example.java_.variableArgument.t2;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1,2);
		m1(1,2,3);
	}

	static void m1(int... i){
		System.out.println(Arrays.toString(i));
	}
}
