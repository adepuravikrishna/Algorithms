package com.adepu.ravikrishna.arrays;

import java.util.Arrays;

public class DutchNationalFlag {
	
	public static void main(String [] args){
		String s="GRRBRRRGRB";
		int low=0,high=s.length()-1,mid=0;
		char ch[]=s.toCharArray();
		while(mid<=high){
			if(ch[mid]=='G'){
				char temp=ch[mid];
				ch[mid]=ch[high];
				ch[high]=temp;
				high--;
				
			}else if(ch[mid]=='R'){
				char temp1=ch[mid];
				ch[mid]=ch[low];
				ch[low]=ch[mid];				
				low++;
				mid++;
				
			}else if(ch[mid]=='B'){
				mid++;				
			}
			
		}
		System.out.println(Arrays.toString(ch));
		
	}

}
