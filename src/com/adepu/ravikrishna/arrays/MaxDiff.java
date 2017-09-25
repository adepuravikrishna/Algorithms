package com.adepu.ravikrishna.arrays;

public class MaxDiff {
	public static void main(String[] args){
	int[] arr={7,9,5,6,3,2};
	int n=arr.length;
	int maxDiff = -1; // Initialize Result
	 
    int maxRight = arr[n-1]; // Initialize max element from right side
 
    for (int i = n-2; i >= 0; i--)
    {
        if (arr[i] > maxRight)
            maxRight = arr[i];
        else
        {
            int diff = maxRight - arr[i];
            if (diff > maxDiff)
            {
                maxDiff = diff;
            }
        }
    }

	
	System.out.println(maxDiff);
	
	int diff=-1;
	int min=arr[0];
	for(int i=1;i<n;i++){
		if(arr[i]>min){
			int lesss=arr[i]-min;
			if(diff<lesss){
				diff=lesss;
			}
			
		}else{
			min=arr[i];
		}
		
	}
	System.out.println(diff);
		
	}

}
