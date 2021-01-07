package com.datastructures.entrypoint;

import com.datastructures.structures.DynamicArray;

public class Main {

	public static void main(String[] args) {
		//for extra checking
		
		DynamicArray<Integer> da = new DynamicArray<>();
		da.add(1);
		da.add(2);
		da.add(3);
		da.add(4);
		da.removeAt(2);
		
		for(int i=0; i<da.size(); i++) {
			System.out.println(da.get(i));
		}
	}

}
