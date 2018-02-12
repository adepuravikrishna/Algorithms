package com.adepu.ravikrishna.arrays;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	
	public static void main(String[] args){
		String s="leetcode";
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		
		System.out.println(wordBreak(s,wordDict));
		
	}
	   public static boolean wordBreak(String s, List<String> wordDict) {
	        int n=s.length();
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                String a=s.substring(0,i);
	                String b=s.substring(j,n-1);
	                System.out.print(a+"   "+b);
	                if(wordDict.contains(a)&&wordDict.contains(b)){
	                    return true;
	                }
	                System.out.println();;
	            }
	        }
	    return false;
	        
	    }

}
