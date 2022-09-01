package com.example.test.aop.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IntroductionTestAspect {

	@DeclareParents(
			value="com.jdjhaha.core.test.introduction.TestPojo",
			defaultImpl=TestClassA.class)
	public TestInterfaceA testInterfaceA;

	@DeclareParents(
			value="com.jdjhaha.core.test.introduction.TestPojo",
			defaultImpl=TestClassB.class)
	public TestInterfaceB testInterfaceB;
}
