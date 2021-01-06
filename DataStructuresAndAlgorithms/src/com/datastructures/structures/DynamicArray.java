package com.datastructures.structures;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray <T> implements Iterable<T> {
	
	private T[] arr;
	private int capacity = 0;
	private int length = 0;
	
	public DynamicArray() {
		this.capacity = 0;
		this.arr = (T[]) new Object[capacity];
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return size() == 0;
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
		//+1 length
		capacity++;
		T[] new_arr = (T[]) new Object[capacity];
		
		//copy from old array to new
		for(int i=0; i<length; i++) {
			new_arr[i] = arr[i];
		}
		
		//add element!
		new_arr[capacity - 1] = element;
		this.arr = new_arr;
		length++;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
 