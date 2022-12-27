package com.example.java_.collection.Map.t0;

import java.util.HashMap;
import java.util.Map;

public class Run {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>(){
			{
				put("a","aa");
				put("b","bb");
			}
		};

		System.out.println(map);

	}
}
