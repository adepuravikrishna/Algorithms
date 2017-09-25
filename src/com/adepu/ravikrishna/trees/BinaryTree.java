package com.adepu.ravikrishna.trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int data){
		this.data=data;
		left=null;
		right=null;
	}	

}

public class BinaryTree {
	private static TreeNode root;
	
	public static TreeNode insert(TreeNode node,int data){
		  if (node==null) { 
		      node = new TreeNode(data); 
		    } 
		    else { 
		      if (data <= node.data) { 
		        node.left = insert(node.left, data); 
		      } 
		      else { 
		        node.right = insert(node.right, data); 
		      } 
		    }

		    return(node);
		
	}
	
	public static void main(String[] args){
      root=null;
     root= insert(root, 2);
     root=  insert(root, 8);
     root=  insert(root, 10);
     root=  insert(root, 1);
     root=  insert(root, 6);
     root=  insert(root, 5);
     root=  insert(root, 4);
     root=  insert(root, 11);
     leverOrderTraversal(root);
     System.out.println("Height of a tree "+height(root));
		
	}

	private static int height(TreeNode root) {
		if(root==null)
			return 0;
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left,right)+1;
		
		
	}

	private static void leverOrderTraversal(TreeNode root) {
		
		if(root==null)			
			return;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
		root=q.poll();
		System.out.print(root.data+" new level");
		if(root.left!=null)q.add(root.left);
		if(root.right!=null)q.add(root.right);	
		//System.out.println("new level");
		}
		
		
		
	}

}
