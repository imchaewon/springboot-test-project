package com.example.java_.stream.map.builder.t1;

import com.example.java_.SampleJSONData2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.stream.Collectors;

public class Run {
	public static void main(String[] args) throws JsonProcessingException {

		String jsonStr = SampleJSONData2.getData().getJSONArray("humans").toString();

		ObjectMapper mapper = new ObjectMapper();

		List<Human> humans = mapper.readValue(jsonStr, new TypeReference<List<Human>>() {});
		System.out.println(humans);

		List<Human2> humans2 = humans.stream().map(i -> Human2.builder()
				.no(i.no)
				.name(i.name)
				.weight(i.weight)
				.build()
		).collect(Collectors.toList());
		System.out.println(humans2);

	}
}
