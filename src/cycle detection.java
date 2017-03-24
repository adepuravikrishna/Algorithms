/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
   Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
        slow = slow.next;          // 1 hop
        fast = fast.next.next;     // 2 hops 

        if(slow == fast)  // fast caught up to slow, so there is a loop
            return true;
    }
    return false; 

}
