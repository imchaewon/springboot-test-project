package com.example.java_.stream.terminal.collect.extend.t2;

import java.util.ArrayList;
import java.util.List;

public class Child {

	private List<Parent> list;

	public void m1(){
		list = new ArrayList<>();
		list.add(new Parent());
		list.get(0).m1();

	};

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
	}
}
