package com.example.java_.annotation.jackson.jsonSerialize.writeValue.t1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Run {
	public static void main(String[] args) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();

		Person person = new Person("zooneon",25,"seoul");

		objectMapper.writeValue(new File("person.json"),person);


	}
}
