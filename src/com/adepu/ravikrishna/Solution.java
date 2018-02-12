package com.adepu.ravikrishna;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args){
		T s= new T();
//		int[] count=s.getOneBits(161);
//		
//		 for(int i = 0; i<count.length ; i++){
//			 System.out.println(count[i]);
//		 }
	}

}
class T{
//	public int countPrimeSetBits(int L, int R) {
//		int count=0;
//		for(int i=L; i<=R;i++){
//			int j = countBits(i);
//			if(checkIfPrime(j)){
//				count=count+1;
//			}
//		}
//
//		return count;
//
//	}

	public int[] getOneBits(int n) {
		int bi[] = new int[50];

		int idx = 0;
		while (n > 0) {
			bi[idx++] = n % 2;
			n = n / 2;
		}
		int count = 0;
		int k = 1, j = 0;
		int[] result = new int[idx+1];

		for (int i = idx - 1; i >= 0; i--) {
			System.out.print(bi[i]);
			if (bi[i] == 1) {
				count = count + 1;
				result[k] = j + 1;
				k = k + 1;

			}
			j = j + 1;
		}

		result[0] = count;

		List<Integer> ls = new ArrayList<Integer>();

		for (int i = 0; i <= result.length - 1; i++) {
			if (result[i] > 0) {
				ls.add(result[i]);
			}
		}

		int[] arr = ls.stream().mapToInt(i -> i).toArray();

		return arr;
	}
	 public int minSum(int arr[], int n)
	    {
	        int sum = arr[0];
	     
	        for (int i = 1; i < n; i++) 
	        {
	            if (arr[i] == arr[i - 1]) {         
	     
	                int j = i;
	                while (j < n && arr[j] <= arr[j - 1]) 
	                {         
	                    arr[j] = arr[j] + 1;
	                    j++;
	                }
	            }
	            sum = sum + arr[i];
	        }
	     
	        return sum;
	    }

//	public boolean checkIfPrime(int num){
//		int i=2;
//		while(i<= num/2)
//		{
//			if(num % i == 0)
//			{
//				return false;
//			}
//			i++;
//		}
//		return true;
//	}

}
