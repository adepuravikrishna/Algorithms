package com.adepu.ravikrishna.linkedlists;

import java.util.LinkedList;

public class IntersectionOfLinkedList {
	public static void main(String [] args)
	{
		LinkedList<Integer> ls1= new LinkedList<Integer>();
		ls1.add(1);
		ls1.add(13);
		ls1.add(14);
		ls1.add(15);
		ls1.add(17);
		ls1.add(20);
		ls1.add(21);
		
		int median=Integer.MIN_VALUE;
		if(ls1.size()%2==0){
			median= (ls1.get((ls1.size()/2))+ls1.get((ls1.size()/2)+1))/2;
			
		}else{
			median=ls1.get((ls1.size()-1)/2);
		}
		
		System.out.println(median);
	}

}
