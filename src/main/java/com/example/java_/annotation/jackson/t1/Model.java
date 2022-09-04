package com.example.java_.annotation.jackson.t1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Model {

	private int num;

	@JsonSerialize(using = TestEnumSerializer.class)
	@JsonDeserialize(using = TestEnumDeserializer.class)
	private TestEnum test;

}
