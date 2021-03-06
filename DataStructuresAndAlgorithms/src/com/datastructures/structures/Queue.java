package com.datastructures.structures;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {

	private LinkedList<T> list = new LinkedList<T>();
	
	public Queue() {
		
	}
	
	public Queue(T firstElement) {
		offer(firstElement);
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		return list.peekFirst();
	}
	
	public T poll() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		return list.removeFirst();
	}
	
	public void offer(T element) {
		list.addLast(element);
	}
	
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
