package com.adepu.ravikrishna.arrays;

import java.util.Arrays;

public class ArraySum {
	public static void main(String[] args){
		int a[]={1,2,3,4};
		int t[]=a;
		for(int i=0;i<a.length;i++){
			if(i==0)
			a[i]=1;
			a[i]=a[i]*a[i-1];			
		}
		for(int i=t.length;i>0;i--){
			if(i==a.length)
			t[i]=1;
			t[i]=t[i]*t[i-1];			
		}
		for(int i=0;i<a.length;i++){
			a[i]=a[i]+t[i];		
		}
		System.out.println(Arrays.toString(a));
	}

}
