package com.example.test.aop.introduction;

public class TestClassB implements TestInterfaceB {

	@Override
	public void testInterfaceB() {
		System.out.println("TestClassB 의 특정로직 수행");
	}

}
