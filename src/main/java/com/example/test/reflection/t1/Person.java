package com.example.test.reflection.t1;

class Person {
	int age;

	Person() {
		this.age = 27;
	}

	Person(int age) {
		this.age = age;
	}

	int getAge() {
		return this.age;
	}
}