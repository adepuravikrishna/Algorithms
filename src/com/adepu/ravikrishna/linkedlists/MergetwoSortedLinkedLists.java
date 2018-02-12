package com.adepu.ravikrishna.linkedlists;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	
}

public class MergetwoSortedLinkedLists {
	
	public static void main(String[] args){
		Node l1=new Node(1);
		l1.next=new Node(2);
		l1.next.next=new Node(5);
		Node l2= new Node(3);
		l2.next=new Node(4);
		Node mergedNode= mergeTwoSortedLinkedLists(l1,l2);
		printNodes(mergedNode);
		
	}
	
	private static void printNodes(Node head) {
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}
	private static Node mergeTwoSortedLinkedLists(Node l1, Node l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.data < l2.data){
			l1.next = mergeTwoSortedLinkedLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoSortedLinkedLists(l1, l2.next);
			return l2;
		}
		
		
	}

}
