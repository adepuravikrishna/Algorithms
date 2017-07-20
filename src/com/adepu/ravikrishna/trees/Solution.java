package com.adepu.ravikrishna.trees;

//write code that takes as input a string representing a number, and prints out twice that number
//e.g. input "27"
//prints 54

public class Solution{
static int i=0,len=0;
static double result=0;
public static void main(String[] args)
{
String s="afg2000g"; 
len= s.length();
s=s.trim(); 
int j= convertToInte(s);
System.out.println(j); 
}

static int convertToInte(String s){ 
  if(s.equals(""))
	return (int) result*2;	
  if(len==1 && s.charAt(0) >='0' && s.charAt(0)<='9')
   return Integer.parseInt(s)*2;
  if(s.charAt(0)>='0'&& s.charAt(0)<='9') 
   result= result * 10 + s.charAt(0)-'0';
return convertToInte(s.substring(i+1));

}

}

