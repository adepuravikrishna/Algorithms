package com.adepu.ravikrishna.trees;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args){
		String[] s={"([])","(("};
		checkIfValid(s);
	}

	private static void checkIfValid(String[] s) {
		Stack<Character> st= new Stack<Character>();
		
		for(String sr:s){
			boolean flag=true;
			char[] ch=sr.toCharArray();
			for(char c:ch){
				if(c == '('){
					st.push(')');
					
				}else if(c == '['){
					st.push(']');
					
				}
				
				else if(st.isEmpty() || c!=st.pop()){
					
						flag=false;
					
				}
				
			}
			
			if(st.isEmpty()&&flag)
			System.out.println(sr+ "is valid");
			else
			System.out.println(sr+ "is NOT valid");	
		}
		
	
		
	}
}
