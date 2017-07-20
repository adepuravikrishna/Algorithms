package com.adepu.ravikrishna.linkedlists;

import java.util.Stack;


public class MatchingParanthesis {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
	public static void main(String[] args){
		
		String s="((1+2)*3)";
		//boolean z= hasMatchingParantheses(s);
		System.out.println(hasMatchingParantheses(s)); 
		System.out.println(isValid(s)); 
	}
	
	 static boolean hasMatchingParantheses(String a) {
	       Stack<Integer> p = new Stack<>();
	        for(int i = 0; i < a.length(); i++) {
	            int q = "(){}[]".indexOf(a.substring(i, i + 1));
	            if(q % 2 == 1) {
	                if(p.isEmpty() || p.pop() != q - 1) return false;
	            } else p.push(q);
	        }
	        return p.isEmpty();


	    }

}
