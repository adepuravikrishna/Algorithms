/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    if(head == null) {
        /* Insert in a empty list */
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }
    else if(head.next == null) {
        /* Insert at the tail */
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        head.next = newNode;
        return head; 
    }
    else {
        Insert(head.next, data);
        /* This will return the head a the beginning as 
           the 'return' will put them on the stack to be popped off wen the function ends */
        return head;
    }
}
