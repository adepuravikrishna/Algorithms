package com.adepu.ravikrishna;

import java.util.PriorityQueue;

public class KthLargest {
	
	public static void main(String[] args){
		int[] arr={1,2,6,3,4,5,8,7,10,9};
		int n=ThirdLargest(arr);
		System.out.println(n);
		
	}
    static int ThirdLargest(int[] arr) {
        PriorityQueue<Integer> p= new PriorityQueue<Integer>();
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            int k=0;
            p.add(arr[i]);
            if(p.size()>3){
                p.poll();              
            }
            
        }
        
        return p.poll();


    }


}
