package com.example.test.char_.t1;

public class Run {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'a';
		System.out.printf("%c\n",c1);
		System.out.printf("%c\n",97);
		System.out.printf("%s\n",c1);
		System.out.printf("%c\n","a".charAt(0));

		System.out.println("--------");

		System.out.println("a".charAt(0));
		System.out.println("a".charAt(0) == 97);
		System.out.println(("a".charAt(0)+"").equals("97"));

		System.out.println("--------");

		System.out.println(c1 + c2);
		System.out.println(String.valueOf(c1 + c2) == "194");
		System.out.println(String.valueOf(c1 + c2).equals("194"));

	}
}
