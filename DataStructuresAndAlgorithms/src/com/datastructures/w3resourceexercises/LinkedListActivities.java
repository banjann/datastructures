package com.datastructures.w3resourceexercises;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListActivities {
	private static LinkedList<String> list;

	public static void main(String[] args) {
		problem11();
	}
	//Write a Java program to append the specified element to the end of a linked list.
	private static void problemOne() {
		list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	}
	
	//Write a Java program to iterate through all elements in a linked list.
	private static void problemTwo() {
		list = new LinkedList<String>();
		problemOne();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	//Write a Java program to iterate through all elements in a linked list starting at the specified position.
	private static void problemThree(int index) {
		problemOne();
		for(int i=index; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	//Write a Java program to iterate a linked list in reverse order.
	private static void problemFour() {
		problemOne();
		for(int i=list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
	}
	
	//Write a Java program to insert the specified element at the specified position in the linked list.
	private static void problemFive() {
		problemOne();
		list.add(2, "anotherThree");
		for(String x : list) {
			System.out.println(x);
		}
	}
	
	//Write a Java program to insert elements into the linked list at the first and last position
	private static void problemSix() {
		problemOne();
		list.addFirst("anotherOne");
		list.addLast("anotherFour");
		for (String x : list) {
			System.out.println(x);
		}
	}
	
	//Write a Java program to display the elements and their positions in a linked list.
	private static void problem11() {
		
	}
}
