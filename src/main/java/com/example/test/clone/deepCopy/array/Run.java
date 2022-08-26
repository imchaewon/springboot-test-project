package com.example.test.clone.deepCopy.array;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;

		System.out.println(Arrays.toString(arr));

		int[] arr2 = Arrays.copyOf(arr,arr.length);
		arr2[2] = 3;

		System.out.println(Arrays.toString(arr2));

		System.out.println(Arrays.toString(arr));

	}
}
