package com.example.test.stream.testData;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Human {
	public String name;
	public String gender;
	public String birth;
	public Integer height;
	public Double weight;
	public String address;

	public void m1(){
		System.out.println("m1");
	}
}
