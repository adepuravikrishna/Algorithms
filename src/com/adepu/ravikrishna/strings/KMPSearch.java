package com.adepu.ravikrishna.strings;

public class KMPSearch {
	public static void main(String[] args){
		String s="ravikrishnadepu";
		String pattern="ade";
		
	boolean alright=NativeSearch(s,pattern);
		//char a[] =makeTempArray();
	System.out.println(alright);
		
	}

	private static boolean NativeSearch(String s, String pattern) {
		
		for(int i=0;i<=s.length()-pattern.length();i++){
			int count=0;
			for(int j=0;j<pattern.length();j++){
				if(pattern.charAt(j)!=s.charAt(i+j)){
					break;
				}
				if(j==pattern.length()-1){
				return true;
				}
				
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
