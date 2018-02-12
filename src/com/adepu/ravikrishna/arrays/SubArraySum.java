package com.adepu.ravikrishna.arrays;

public class SubArraySum {
	public static void main(String[] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int result= maximumSumSubArray(nums);
		System.out.println(result);
		
	}
	
   //Popular Kadane's algorithm O(n)
	private static int maximumSumSubArray(int[] A) {
		 int maxSoFar=A[0], maxEndingHere=A[0];
		    for (int i=1;i<A.length;++i){
		    	maxEndingHere = maxEndingHere + A[i];
		    	if(maxEndingHere < 0)
		    	maxEndingHere = 0;
		    	if(maxSoFar < maxEndingHere)
		    	maxSoFar = maxEndingHere;
		    }
		    return maxSoFar;		    
	}
	
	//Divide and Conquer Approach O(nlogn) 
	//Time complexity equation T(N) = 2 T(n/2) + O(n)
	

}
