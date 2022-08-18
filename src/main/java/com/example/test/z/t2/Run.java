package com.example.test.z.t2;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		Child c = new Child();

		System.out.println(c instanceof Parent);
		System.out.println(c instanceof Child);
		System.out.println(c instanceof Object);

		List<String> list = new ArrayList<>();

		System.out.println(list instanceof ArrayList);
		System.out.println(list instanceof List);

	}
}
