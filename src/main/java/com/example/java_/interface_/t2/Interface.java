package com.example.java_.interface_.t2;

public interface Interface {
	int test();

	default int test2(int a) {
		return a + 2;
	}
}
																						