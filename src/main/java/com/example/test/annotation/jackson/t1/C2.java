package com.example.test.annotation.jackson.t1;

import lombok.ToString;

@ToString(callSuper = true)
public class C2 extends C1{
	String gender;
}
