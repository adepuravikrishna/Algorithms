package com.adepu.ravikrishna.strings;

import java.util.Stack;

public class MatchingPairs {
	public static void main(String[] args){
	//	String s="ABCDdCccB";
		String s="ABbCca";
		int match=isItMatching(s);
		
		System.out.println(match);
		
		
	}

	private static int isItMatching(String s) {
		char[] ch=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
		int count=0;
		for(int i=1;i<ch.length;i++){
			if(Character.isUpperCase(ch[i-1])){
				if(Character.isUpperCase(ch[i])){
					st.push(ch[i-1]);
					st.push(ch[i]);
					count=count+2;
					
				}else{
					if(ch[i] == Character.toLowerCase(st.pop())){
						count=count+1;
						
					}
				}
			}else{
				if((Character.toLowerCase(st.pop())==ch[i-1]))
				{
					continue;
				}
				else if(st.isEmpty()){
					return count;
				}
				else{
					return count;
				}
			}
	
			
		}
		return count;
	}

}
