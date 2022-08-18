package com.example.test.collection.list.t1;

import java.util.Arrays;
import java.util.List;

public class C1 {

	public void m1(){
		List<String> list = Arrays.asList("가","나","다");
		list.forEach(a -> {
			System.out.println(a);
		});
		list.forEach(this::m2);
	}

	public void m2(String s){
		System.out.println(s);
	}
}
