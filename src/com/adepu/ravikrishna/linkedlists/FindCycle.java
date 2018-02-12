package com.adepu.ravikrishna.linkedlists;

class TestNode{
	int data;
	TestNode next;
	TestNode(int data){
		this.data =data;
	}
}

public class FindCycle {
	public static void main(String[] args){		
		TestNode t= new TestNode(1);
		t.next = new TestNode(2);
		t.next.next = new TestNode(3);
		t.next.next.next = new TestNode(4);
		t.next.next.next.next = new TestNode(5);
		t.next.next.next.next.next = new TestNode(6);
		//created cycle here
		t.next.next.next.next.next.next = t;	
		boolean duh = findACycle(t);
		System.out.println(duh);
	}

	private static boolean findACycle(TestNode t) {
		TestNode slow = t;
		
		if(t.next == null){
			return false;
		}
		TestNode fast = t.next;
		
		while(slow != null && fast !=null && fast.next != null){
			if(slow == fast)
			return true;
			slow = slow.next;
			fast = fast.next.next;			
		}		
		
		return false;
	}
	
	

}
