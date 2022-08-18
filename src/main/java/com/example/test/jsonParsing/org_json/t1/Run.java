package com.example.test.jsonParsing.org_json.t1;

import com.example.test.stream.testData.Human;
import com.example.test.stream.testData.HumanData;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class Run {
	public static void main(String[] args) {

		JSONObject obj = HumanData.getData();
		JSONArray arr = (JSONArray) obj.get("data");

//		List<Object> list = arr.toList();


		// <List<Map>> 으로 변환
		List<Map<String,Object>> list = new ArrayList<>();

		for (Object o : arr) {
			list.add(((JSONObject) o).toMap());
		}

		System.out.println(list);

		System.out.println(list.get(0).get("name"));


		// <List<VO>>로 변환
		List<Human> list2 = new ArrayList<>();

		arr.forEach(i -> {
			JSONObject o = (JSONObject)i;
			Field[] h = Human.class.getFields();
			System.out.println(Arrays.toString(h));
			System.out.println(h.length);

			Arrays.stream(h).forEach(i2->{
//			System.out.println(i);
//			System.out.println(i.getName());
				String key = i2.getName();
				if(o.has(key)) // 객체에 클래스필드에 해당하는 키가 있으면
					list2.add(new Human());

			});

//			Set<String> s = o.keySet();
		});



		Set<String> set = new HashSet<>();
		set.add("bb");
		set.add("cc");
		set.add("aaa");
		System.out.println(set);
		System.out.println(set.stream().sorted().collect(Collectors.toList()));




	}

}
