package com.adepu.ravikrishna;

public class ReverseWwordsStringSentense {
	public static void main(String[] args){
		String s="my name is ravi.";
		String z= reverseWords(s);
		System.out.println(z);
	}

	private static String reverseWords(String s) {
		String[] parts = s.trim().split("\\s+");
		String out = "";
		for (int i = parts.length - 1; i > 0; i--) {
		    out += parts[i] + " ";
		}
		return out + parts[0];
	}

	

}
