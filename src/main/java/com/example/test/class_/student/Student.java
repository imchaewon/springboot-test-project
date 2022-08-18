package com.example.test.class_.student;

public class Student implements Cloneable {
	String sno;
	String name;
	int age;
	String dept;
	int[] scores;

	public Student(String sno, String name, int age, String dept, int[] scores) {
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.scores = scores;
	}
	public Student getStudent() {
		Student cloned = null;
		try {
			cloned = (Student)clone();
		} catch (CloneNotSupportedException e) {

		}
		return cloned;
	}
}