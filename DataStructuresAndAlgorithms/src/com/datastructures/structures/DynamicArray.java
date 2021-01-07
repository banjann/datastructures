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
		if(index >= size() ) {
			throw new IndexOutOfBoundsException();
		} else {
			arr[index] = element;
		}
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
	
	public void removeAt(int index) {
		if (index >= size() ) {
			throw new IndexOutOfBoundsException();
		}
		
		T[] new_arr = (T[]) new Object[size() - 1];
		
		for(int i=0, j=0; i<size(); i++, j++) {
			if(i == index) {
				j--;
			} else {
				new_arr[j] = arr[i];
			}
		}
		length--;
		this.arr = new_arr;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
 