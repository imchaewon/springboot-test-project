package com.example.java_.annotation.jackson.jsonCreator2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
class Student {
	private int id;
	private String name;

	@JsonCreator
	public Student(@JsonProperty("id") int rollNo, @JsonProperty("name") String name){
		this.name = name;
		this.id = rollNo;
	}
}
