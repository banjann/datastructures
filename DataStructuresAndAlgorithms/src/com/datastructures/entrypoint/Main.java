package com.datastructures.entrypoint;

import com.datastructures.structures.DynamicArray;

public class Main {

	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<>();
		da.add(1);
		
		for(int i=0; i<da.size(); i++) {
			System.out.println(da.get(i));
		}
	}

}
