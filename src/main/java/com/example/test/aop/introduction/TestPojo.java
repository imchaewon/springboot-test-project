package com.example.test.aop.introduction;

import org.springframework.stereotype.Component;

@Component
public class TestPojo {

	public void doSomeThing(String args) {
		System.out.println("TestPojo doSomeThing()");
	}
}
