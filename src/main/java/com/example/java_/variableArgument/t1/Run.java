package com.example.java_.variableArgument.t1;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {

		m1("a","b","c","d");

	}

	public static void m1(String ... strings) {
		System.out.println(Arrays.toString(strings));
	}
}
