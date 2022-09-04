package com.example.java_.annotation.jackson.jsonSerialize.JsonTypeInfo_JsonSubTypes.t1;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.ToString;

@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, visible = true, property = "event_name", defaultImpl = Undefined.class)
@JsonSubTypes({
		@JsonSubTypes.Type(name = "c2", value = C2.class),
		@JsonSubTypes.Type(name = "c3", value = C3.class),
})
public abstract class C1 {
	String name;
	int age;
}
