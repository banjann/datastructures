package com.datastructures.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class DoublyLinkedList<T> implements Iterable<T> {
	private int size = 0;
	private Node<T> head = null;
	private Node<T> tail = null;
	
	//data or node of the linkedlist
	private class Node<T> {
		T data;
		Node<T> prev;
		Node<T> next;
		
		public Node(T data, Node<T> prev, Node<T> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return data.toString();
		}
	}
	
	//empty this linked list
	public void clear() {
		Node<T> traverser = head;
		while(traverser.next != null) {
			Node<T> next = traverser.next;
			traverser.next = null;
			traverser.prev = null;
			traverser.data = null;
			traverser = next;
		}
		head = null;
		tail = null;
		size = 0;
	}
	
	//return the number of nodes
	public int size() {
		return size;
	}
	
	//check if the list is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	//append element to the tail of the list
	public void add(T element) {
		if(isEmpty() ) {
			head = tail = new Node<T>(element, null, null);
		} else {
			tail.next = new Node<T>(element, tail, null);
			tail = tail.next;
		}
		size++;
	}
	
	//append element to the head of the linked list
	public void addFirst(T element) {
		if(isEmpty() ) {
			head = tail = new Node<T>(element, null, null);
		} else {
			head.prev = new Node<T>(element, null, head);
			head = head.prev;
		}
		size++;
	}
	
	//return the value of the head
	public T peekFirst() {
		if(isEmpty()) {
			return null;
		} else {
			return head.data;
		}
	}
	
	//return the value of the tail
	public T peekLast() {
		if(isEmpty()) {
			return null;
		} else {
			return tail.data;
		}
	}

	//Removes and returns the first element from this list.
	public T removeFirst() {
		if(isEmpty() ) {
			throw new NoSuchElementException();
		} else {
			T data = head.data;
			head = head.next;
			size--;
			if(isEmpty() ) {
				tail = null;
			} else {
				head.prev = null;
			}
			return data;
		}
	}
	
	//Removes and returns the last element from this list.
	public T removeLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		} else {
			T data = tail.data;
			tail = tail.prev;
			size--;
			if(isEmpty() ) {
				head = null;
			} else {
				tail.next = null;
			}
			return data;
		}
	}
	
	//removes the specified node and returns the value of the removed node
	private T remove(Node<T> node) {
		if(node.prev == null) {
			return removeFirst();
		} else if(node.next == null) {
			return removeLast();
		} else {
			node.next.prev = node.prev;
			node.prev.next = node.next;
			T data = node.data;
			node = null;
			size--;
			return data;
		}
	}
	
	//Removes the element at the specified position in this list and returns the value of the removed element
	public T remove(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		} else {
			Node<T> traverser = head;
			if (index < (size() / 2)) {
				for(int i=0; i<index; i++) {
					traverser = traverser.next;
				}
			} else {
				for(int i=size()-1; i>index; i--) {
					traverser = traverser.prev;
				}
			}
			return (T) remove(traverser);
		}
	}
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
