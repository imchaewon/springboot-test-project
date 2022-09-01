package com.example.test.aop.introduction;

public class TestClassA implements TestInterfaceA {

	@Override
	public void testInterfaceA() {
		System.out.println("TestClassA 의 특정로직 수행");
	}

}
