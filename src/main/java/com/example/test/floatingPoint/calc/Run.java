package com.example.test.floatingPoint.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
	public static void main(String[] args) throws IOException {

		// 실수 10진수를 2진수로 변환
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String num = reader.readLine();

		String result="";

		int point = num.indexOf(".");

		String significand = num.substring(0, point);
		String mantissa = num.substring(point + 1);

//		while (significand / 2)


		result += "";

		System.out.println(result);

	}
}
