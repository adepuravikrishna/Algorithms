package com.adepu.ravikrishna.arrays;

public class StringPermutation {
	public static void main(String[] args){
		String s="abcd";
		for(int i=0;i<s.length();i++)
		{
		  StringBuilder sb=new StringBuilder();
		    sb.append(s.charAt(i));
			for(int j=0;j<s.length();j++)
			{
				if(j!=i)
				sb.append(s.charAt(j));
			}
			System.out.println(sb.toString());
		}
		
	}

}
