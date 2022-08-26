package com.example.test.reflection.t1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
	public static void main(String[] args) {

		// 생성자 찾기
		Class clazz = null;
		try {
			clazz = Class.forName("com.example.test.reflection.t1.Person");
			Constructor constructor = clazz.getDeclaredConstructor();

			System.out.println(constructor);

		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}


		// 메소드 찾기 / 실행
		Class clazz2 = Person.class;
		Method[] methodList = clazz2.getDeclaredMethods();
		try {
			System.out.println(methodList[0].invoke(clazz2.newInstance())); // 27이 출력됨
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		}

		// 필드 가져오기
		Class clazz3 = Person.class;
		Field[] field = clazz.getDeclaredFields();
		System.out.println(field[0]);   // 출력 : int reflection_test.Person.age


		// 필드값 변경
		Class clazz4 = Person.class;
		Field[] field2 = clazz.getDeclaredFields();

		Person person = new Person();
		try {
			field2[0].set(person, 17);
			System.out.println(field2[0].get(person));  // 17이 출력됨
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}


	}
}
