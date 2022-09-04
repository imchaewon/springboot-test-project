package com.example.java_.annotation.jackson.jsonDeserialize.jsonCreator.t5;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Person {
	private String name;
	private Contact contact;
	private Job job;
}
