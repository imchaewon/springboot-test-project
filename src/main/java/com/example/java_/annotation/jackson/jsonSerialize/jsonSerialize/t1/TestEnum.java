package com.example.java_.annotation.jackson.jsonSerialize.jsonSerialize.t1;

import lombok.Getter;

@Getter
enum TestEnum {
	TEST_1("tmpTestValue1"),
	TEST_2("tmpTestValue2"),
	;
	private String value;
	TestEnum(String value) {
		this.value = value;
	}
}
