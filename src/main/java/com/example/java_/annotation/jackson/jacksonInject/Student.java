package com.example.java_.annotation.jackson.jacksonInject;

import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
class Student {

	@JacksonInject
	private int id;

	private String name;

}
