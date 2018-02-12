package com.adepu.ravikrishna.strings;

public class LongestSubstringWithOutRepeatingCharacter {
	
	public static void main(String[] args){
		String s=")()())()()()";
	    char[] ch=s.toCharArray();
	    for(int i=0;i<=ch.length;i++){
	    	for(int j=i+1;j<=ch.length;j++){
	    		//System.out.print(s.substring(i,j));
	    		System.out.print(i+"  "+j+"  ");
	    		if(i==6 && j==12){
	    			System.out.println("we may want this     "+ s.substring(i,j));
	    		}
	    		System.out.println();
	    	}
	    	
	    }
		
	}

}
