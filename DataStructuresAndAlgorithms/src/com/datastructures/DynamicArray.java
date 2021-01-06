package com.datastructures;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray <T> implements Iterable<T> {
	
	private T[] arr;
	private int capacity = 0;
	private int length = 0;
	
	public DynamicArray() {
		this.capacity = 32;
		this.arr = (T[]) new Object[capacity];
	}
	
	public DynamicArray(int cap) {
		if(cap <= 0) {
			throw new IllegalArgumentException(cap + "is an Illegal Capacity");
		}
		
		this.capacity = cap;
		this.arr = (T[]) new Object[capacity];
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public void set(int index, T element) {
		arr[index] = element;
	}

	public void clearAll() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = null;
			length = 0;
		}
	}
	
	public void add(T element) {
		
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
 