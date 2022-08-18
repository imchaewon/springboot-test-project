package com.example.testProject.test.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("kiaa")
public class Kia extends Car{
	@Override
	public String getCEO() {
		return "송호성";
	}
}
