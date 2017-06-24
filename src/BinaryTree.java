

class Node {
	int data;		
	Node left,right;

	Node(int value)
	{
     this.data = value;
	}

	public void insert(int value)
	{
		if(value<data)
		{
			if(left==null)
			{
				left = new Node(value);
			}else{
				left.insert(value);
			}
		}
		else{
			if(right==null)
			{
				right=new Node(value);
			}else{
				right.insert(value);
			}
		}
		
	}
	public boolean find(int value)	
	{
		if(value==data){
			
			return true;
		}
		else if(value<data)
		{
			if(left==null){
				return false;
				
			}
			else{
				left.find(value);
			}
		}else{
			if(right==null){
				return false;
				
			}
			else{
				right.find(value);
			}
		}
		return true;
		
	}
	void printInorder(){
		if(left!=null)
		{
			left.printInorder();
		}
		System.out.println(data);
		if(right!=null)
		{
			right.printInorder();
		}
	}
	/* Given a binary tree, print out all of its root-to-leaf
    paths, one per line. Uses a recursive helper to do the work.*/
 void printPaths(Node node) 
 {
     int path[] = new int[1000];
     printPathsRecur(node, path, 0);
 }

 /* Recursive helper function -- given a node, and an array containing
    the path from the root node up to but not including this node,
    print out all the root-leaf paths. */
 void printPathsRecur(Node node, int path[], int pathLen) 
 {
     if (node == null)
         return;

     /* append this node to the path array */
     path[pathLen] = node.data;
     pathLen++;

     /* it's a leaf, so print the path that led to here */
     if (node.left == null && node.right == null)
         printArray(path, pathLen);
     else
         { 
         /* otherwise try both subtrees */
         printPathsRecur(node.left, path, pathLen);
         printPathsRecur(node.right, path, pathLen);
     }
 }

 /* Utility that prints out an array on a line */
 void printArray(int ints[], int len) 
 {
     int i;
     for (i = 0; i < len; i++) 
         System.out.print(ints[i] + " ");
     System.out.println("");
 }
	
}
public class BinaryTree {
	
 public static void main(String[] args){
	 
	 Node root = new Node(10);
	 root.insert(3);
	 root.insert(2);
	 root.insert(9);
	 root.insert(107);
	 root.insert(130);
	 root.insert(120);
	 root.insert(1430);
	// root.printInorder();
//	//System.out.println( root.find(120));
//	 root.printPaths(root);
//	 root.printInorder();
//	 
	 
 }
  
	
	
	
	
	
	




}
