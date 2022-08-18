package com.example.test.z.t1;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {

		List<Tire> tires = new ArrayList<>();
		tires.add(new Tire());
		tires.add(new Tire());

		System.out.println(tires);

		for(Tire tire : tires){
			tire.roll();
		}

		System.out.println();

		for(int i=0;i<tires.size();i++){
			tires.get(i).roll();
		}

		System.out.println();

		tires.forEach(item -> {
			item.roll();
		});

		System.out.println();

		tires.forEach(Tire::roll);



	}
}
