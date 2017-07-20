package com.adepu.ravikrishna.recursion;

public class SubSetGeneration {
	public static void main(String[] args){
		
		int a[]={1,2,3,4};
		permuteString(a,0);
		
	
	}

	private static void permuteString(int[] a, int index) {
		if(index==a.length){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]);				
			}
			System.out.println();			
		}
		for(int j=index;j<a.length;j++){
			swap(a,index,j);
			permuteString(a,index+1);
			swap(a,index,j);
			
		}
		
	}

	private static void swap(int[] a, int index, int j) {
		int t=a[index];
		a[index]=a[j];
		a[j]=t;
		
	}

}
