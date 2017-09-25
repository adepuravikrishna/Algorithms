package com.adepu.ravikrishna.arrays;

import java.util.Arrays;

public class SortColors {
	
	public static void main(String[] args){
		int[] A={2,1,2,0,2,1,1,2,0,0,1};
		int low=0,i=0,high=A.length-1;
		while(i<=high){
			   if(A[i]==0) {
		              // swap A[i] and A[low] and i,low both ++
		              int temp = A[i];
		              A[i] = A[low];
		              A[low]=temp;
		              i++;low++;
		           }else if(A[i]==2) {
		               //swap A[i] and A[high] and high--;
		              int temp = A[i];
		              A[i] = A[high];
		              A[high]=temp;
		              high--;
		           }else {
		               i++;
		           }
		}

		System.out.println(Arrays.toString(A));
		
		
	}

	
}
