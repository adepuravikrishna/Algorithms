package com.adepu.ravikrishna.arrays;

public class MergeSortedArray {
	public static void main(String[] args){
		int a[]={1,4,5};
		int b[]={3,4,5,0,0,0};
		for(int i=0;i<b.length;i++){
			if(i<a.length){
				if(a[i]<b[i]){
					b[b.length-a.length]=b[i];
					b[i]=a[i];
				}else if(a[i]<b[i]){
					
				}else{
					
				}
				
			}
			
			
		}
	}

}
