package com.adepu.ravikrishna.arrays;

import java.util.Arrays;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

		int start=0;
		int end = nums.length-1;
		int[] temp= new int[2];
		Arrays.sort(nums); //this wont work since we have to return index

		while (start < end){
			if(nums[start]+nums[end]==target){

				temp[0]=start;
				temp[1]=end;
				return temp;
			}
			else if ( nums[start] + nums[end] > target ) end--;
			else start++;

		}
		return temp;
	}
	public static void main(String[] args){
		TwoSum ts= new TwoSum();
		int[] nums ={3,2,4};
		int target= 6;
		int[] n= ts.twoSum(nums, target);
		System.out.println(Arrays.toString(n));


	}

}
