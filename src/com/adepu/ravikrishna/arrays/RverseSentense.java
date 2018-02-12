package com.adepu.ravikrishna.arrays;

import java.util.Arrays;

public class RverseSentense {
	public static void main(String[] args){
		String s="this is a test by ravi";
		String reversed= reverseUtil(s);
		System.out.println(reversed);
	}

	private static String reverseUtil(String s) {
		String z= reverse(s);
		System.out.println("After first reverse  "+z);
		String[] adz =z.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		int i=0;
		for(String temp:adz){
			if(i == 0)
			sb.append(reverse(temp));
			sb.append(reverse(temp));
			sb.append(" ");	
			i++;
		}
		return sb.toString();
	}

	private static String reverse(String s) {
		int i=0,j=s.length()-1;
		char ch[]=s.toCharArray();
		while(i<=j){
			char temp=ch[j];
			ch[j--]=ch[i];
			ch[i++]=temp;
		}
	  return ch.toString();
	}

}
