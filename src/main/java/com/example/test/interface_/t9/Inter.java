package com.example.test.interface_.t9;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public interface Inter<T> {

	@Getter
	@ToString
	@Builder
	class C1 {
		private String name;
		private int age;
	}

	T m1(C1.C1Builder builder, String url);

	default T m1() {
		return m1(new C1.C1Builder(),"asd");
	}

}
