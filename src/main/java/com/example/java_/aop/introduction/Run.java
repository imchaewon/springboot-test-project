package com.example.java_.aop.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

	// 뭔가 잘 안되는듯
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(IntroductionTestConfiguration.class);
		TestPojo testPojo = context.getBean(TestPojo.class);

		testPojo.doSomeThing("test");

		TestInterfaceA testClassA = (TestInterfaceA)testPojo;
		testClassA.testInterfaceA();

		TestInterfaceB testClassB = (TestInterfaceB)testPojo;
		testClassB.testInterfaceB();
	}
}
