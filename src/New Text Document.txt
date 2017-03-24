/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null)
        {
        return false;
    }
    
    Node d = head;
    HashMap<Integer,Node> hs = new HashMap<Integer,Node>();
    int i=0;
    while(d!=null)
        {
        if(hs.containsValue(d))
            {
            return true;
            
        }
        else
            {
            hs.put(i,d);
            i++;
            d=d.next;
        }
        
    }
    return false;

}
