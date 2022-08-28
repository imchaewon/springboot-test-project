package com.example.test.floatingPoint.calc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
	public static void main(String[] args) throws IOException {

		// 실수 10진수를 2진수로 변환
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String num = reader.readLine();

		String num = "123.125";
		String r_binary = toBinary(num);

		System.out.println(r_binary);

		double r_decimal = toDecimal(r_binary);

		System.out.println(r_decimal);

	}

	private static double toDecimal(String binary) {
		int point = binary.indexOf(".");

		String significand = binary.substring(0, point);
		String mantissa = binary.substring(point + 1);

		char[] arr_significand = significand.toCharArray();
		char[] arr_mantissa = mantissa.toCharArray();

		int r_significand = 0;
		int r_mantissa = 0;

		double result = 0.0;

		for(int i=0;i<arr_significand.length;i++){
			System.out.println("pow: "+ Math.pow(2,arr_significand.length - i - 1));
			if(i == 1)
				r_significand += (int) Math.pow(2,arr_significand.length - i - 1);
		}
		System.out.println(r_significand);

		return result;
	}

	private static String toBinary(String num) {
		int point = num.indexOf(".");

		String significand = num.substring(0, point);
		String mantissa = num.substring(point + 1);

		int i = Integer.parseInt(significand);
		int j;
		int k = Integer.parseInt(mantissa);

		List<Integer> significandList = new ArrayList<>();
		List<Integer> mantissaList = new ArrayList<>();

		StringBuilder result = new StringBuilder();

		while (i>1){
			i /= 2;
			j = i % 2;
			significandList.add(j);
		}
		Collections.reverse(significandList);

		while (mantissaList.size() <= 10){
			int len = (int)Math.log10(k)+1;
			boolean carry = Math.log10(k * 2) + 1 - len == 1;
			if (carry){
				mantissaList.add(1);
			}else{
				mantissaList.add(0);
			}
			if(len > 1)
				k = Integer.parseInt((k+"").substring(1));
			else
				break;
		}

		for(int item:significandList){
			result.append(item);
		}
		result.append(".");
		for(int item:mantissaList){
			result.append(item);
		}
		return String.valueOf(result);
	}
}
