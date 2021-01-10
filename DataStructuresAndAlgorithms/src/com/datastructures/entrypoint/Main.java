package com.datastructures.entrypoint;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		boolean isValid = bracket("{[]{}()");
		System.out.println(isValid);
		
	}

	private static String reverseBracket(char bracket) {
		String reversed = null;
		switch (bracket) {
		case '{':
			reversed = "}";
			break;
		case '[':
			reversed = "]";
			break;
		case '(':
			reversed = ")";
			break;
		}
		return reversed;
	}
	
	private static boolean bracket(String brackets) {
		boolean isValid = false;
		Stack<String> stack = new Stack<String>();
		for (int i=0; i<brackets.length(); i++) {
			if(brackets.charAt(i) == '{' || brackets.charAt(i) == '[' || brackets.charAt(i) == '(') {
				String toAdd = reverseBracket(brackets.charAt(i));
				stack.push(toAdd);
			} else {
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			isValid = true;
		}
		return isValid;
	}
}
