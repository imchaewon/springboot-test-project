package com.example.java_.annotation.json.jsonCreator1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
class Student {
	public int id;
	public String name;

	@JsonCreator
	public Student(@JsonProperty("rollNo") int rollNo, @JsonProperty("theName") String name){
		this.id = rollNo;
		this.name = name;
	}
}
