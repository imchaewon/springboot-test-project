package com.example.java_.stream.map.builder.t1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Human {
	int no;
	String name, gender;
	float weight;
}
