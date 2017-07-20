package com.adepu.ravikrishna.trees;

class Node{
	int data;
	Node left,right;
	
	public Node(int data){
		this.data=data;
		
	}
	
}

public class BinTree {
	
	static Node root = null;
	public static void main(String[] args)
	{
		
		root=new Node(17);
		 insert(12);
		 insert(13);
		 insert(1);
		 insert(19);
		 insert(20);
		 insert(2);
		 Inorder(root);
		
		
	}

	private static void Inorder(Node root) {
		if(root==null)
			return;
		Inorder(root.left);
		System.out.print(root.data);
		Inorder(root.right);
		// TODO Auto-generated method stub
		
	}

	private static Node insert(int data) {
		if(root.data==data || root==null){
			return root;
			
		}
		
		 if(data<root.data){
			if(root.left==null){
				root.left= new Node(data);			
			}else{
				return insert(data);
			}
			
		}else{
			if(root.right==null){
				root.right= new Node(data);
			}
			else
			 return insert(data);
			
		}
		return root;
				
		

	
	}
}
