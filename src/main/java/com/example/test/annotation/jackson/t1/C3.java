package com.example.test.annotation.jackson.t1;

import lombok.ToString;

@ToString(callSuper = true)
public class C3 extends C1{
	float weight;
}
