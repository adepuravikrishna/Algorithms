package com.adepu.ravikrishna.linkedlists;

class RaviNode{
	int data;
	RaviNode next;
	RaviNode(int data){
		this.data=data;
	}
}

public class ReverseOfLinkedList {
	public static void main(String[] args){
		RaviNode node= new RaviNode(1);
		node.next=new RaviNode(2);
		node.next.next=new RaviNode(3);
		node.next.next.next=new RaviNode(4);
		node.next.next.next.next=new RaviNode(5);
		RaviNode raj= rajReverse(node);
		printNodes(raj);
//		RaviNode reversed= reverseLinkedList(node);
//		RaviNode original= reverseLinkedList( reversed);
//		printNodes(reversed);
//		System.out.println("Recursion of reverse linekdlist");
//		RaviNode rv= recursiveReverse1LinkedList(original);
//		
//		printNodes(rv);
	}

	private static RaviNode rajReverse(RaviNode head) {
		 if(head == null || head.next == null){
	            return head ;
	        }
	         RaviNode first = head;
	         RaviNode second = head;
	         RaviNode third = head;
	        if(head.next.next !=null){
	           second = head.next;
	           third = head.next.next;
	        }
	        else{
	        	second = head.next;
	        	first.next = null;
	        	second.next = first;
	        	return second;
	        }
			first.next=null;
	        while(third !=null){
	            second.next = first;
	            first = second;
	            second = third;
	            third = third.next;
	        }
	        second.next = first;
	        return second;
	}

	private static RaviNode recursiveReverseLinkedList(RaviNode node) {
		if(node==null){
			return null;
		}
		else if(node.next==null){
		return node;
		}
		else{
			RaviNode nextNode= node.next;
			node.next=null;
			RaviNode build= recursiveReverseLinkedList(nextNode);
			nextNode.next=node;
			return build;
						
		}
		
	}

	private static void printNodes(RaviNode head) {
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
		
	}

	private static RaviNode reverseLinkedList(RaviNode head) {
		RaviNode current = head;
		RaviNode prev=null,temp=null;
		while(current!=null){
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;		
								
		}
		
		return prev;
	}
	
	private static RaviNode recursiveReverse1LinkedList(RaviNode node) {
		if(node==null)
			return null;		
		else if(node.next==null){
			return node;			
		}else{
			RaviNode next=node.next;
			node.next=null;
			RaviNode rest=recursiveReverse1LinkedList(next);
			next.next=node;
			return rest;
			
		}
		
		
	}

}
