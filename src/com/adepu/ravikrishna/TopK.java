package com.adepu.ravikrishna;

import java.util.PriorityQueue;

public class TopK {
	public static void main(String [] args){
		int[] a={1,2,10,0,100,25};
		printTopK(3,a);
	}

	private static void printTopK(int k, int[] A) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i : A )
		{
			pq.add(i);
			
			if(pq.size() > k)
			{
				pq.poll();
			}
		}
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
		
	}

}
