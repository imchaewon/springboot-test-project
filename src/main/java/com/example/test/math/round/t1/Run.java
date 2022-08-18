package com.example.test.math.round.t1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Run {
	public static void main(String[] args) {

		double d = 12.34;

		System.out.println(Math.ceil(d));
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(String.format("%.0f",d));

		double d2 = -12.34;

		System.out.println(Math.ceil(d2));
		System.out.println(Math.round(d2));
		System.out.println(Math.floor(d2));
		System.out.println(String.format("%.0f",d2));

	}
}
