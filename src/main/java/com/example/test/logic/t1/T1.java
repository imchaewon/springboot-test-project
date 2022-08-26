package com.example.test.logic.t1;

public class T1 {
	public static void main(String[] args) {

		int i = 1;
		int j = 2;
		int k = 3;

		if(i != 2 && j != 3 && k != 3){
			System.out.println(true);
		}else{
			System.out.println(false);
		}

		// 위 아래 동일함

		if(!(i == 2 || j == 3 || k == 3)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}

	}
}
