package com.example.test.assert_;

public class Run {
	public static void main(String[] args) {
		m1();
	}

	public static void m1(){
		String s1 = null;

		int rand = (int) Math.floor(Math.random() * 2);

		System.out.println(rand);

		if (rand == 1){
			s1 = "asd";
		}

		System.out.println(s1);

//		assert s1 != null;
		assert true;

		System.out.println("끝");

	}
}
