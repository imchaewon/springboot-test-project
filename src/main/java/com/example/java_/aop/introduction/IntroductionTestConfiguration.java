package com.example.java_.aop.introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.java_.aop.introduction")
@EnableAspectJAutoProxy
public class IntroductionTestConfiguration {

}