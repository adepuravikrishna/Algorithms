package com.adepu.ravikrishna.recursion;

public class GroupSumProblem {
	public static void main(String [] args){
		int[] a={1,2,3,4,5,6,8,9,10};
		int target=7;
		boolean existsOrNot= findGroupSumExists(0,a,target);
		System.out.println(existsOrNot);			
	}
	
	static boolean findGroupSumExists(int start,int[] a,int target){
		if(start>=a.length)return (target==0);
		if(findGroupSumExists(start+1,a,target-a[start]))return true;
		if(findGroupSumExists(start+1,a,target))return true;
		return false;		
	}

}
