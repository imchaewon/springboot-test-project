package com.example.test.floatingPoint.segment;

import java.io.IOException;

public class Incomplete {
	public static void main(String[] args) throws IOException {

		// 실수 10진수를 2진수로 변환
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String num = reader.readLine();
		String num = "-12.34";

		int[] result = toBinary(num);

		for (int j = 1; j <= ; j+=10) {
			for (int i = 0; i < 10; i++) {
				System.out.print(result[i*j]);
			}
			System.out.println();
		}

	}

	private static int[] toBinary(String num) {
		int point = num.indexOf(".");

		String significand = num.substring(0, point);
		String mantissa = num.substring(point + 1);

		boolean negative = num.charAt(0) == '-';
		if (negative)
			significand = significand.substring(1);

		int i = Integer.parseInt(significand);
		int j;
		int k = Integer.parseInt(mantissa);

		int[] result = new int[32];
		int[] significandList = new int[10];
		int[] mantissaList = new int[10];

		result[0] = negative ? 1 : 0;


//		while (i>0){
//			j = i % 2;
//			i /= 2;
//			if (i == 0) j = 1;
//			significandList.add(j);
//		}
//		Collections.reverse(significandList);

		System.out.println(num);
//		for (int l=0;l<10;l++){
//			int len = (int)Math.log10(k)+1;
//			k *= 2;
//			boolean carry = (int)Math.log10(k) + 1 - len == 1;
//			if (carry){
//				mantissaList.add(1);
//				k = Integer.parseInt((k+"").substring(1));
//			}else{
//				mantissaList.add(0);
//			}
//			if(k == 0)
//				break;
//		}
//
//		if(negative)
//			result.append("-");
//		for(int item:significandList){
//			result.append(item);
//		}
//		result.append(".");
//		for(int item:mantissaList){
//			result.append(item);
//		}
		return result;
	}
}
