
class Node1{
	int data;
	Node1 left,right;
	
	Node1(int data)
	{
		this.data=data;
		
	}
	
	public void insert(int value)
	{
		 if(value<data)
		{
			if(left!=null)
			left.insert(value);
			else
			left=new Node1(value);
			
		}else{
			if(right!=null)
			right.insert(value);
			else
		    right=new Node1(value);
		}
		
	}
	public void Inorder()
	{
		if(left!=null)
		{
			left.Inorder();
		}
		System.out.println(data);
		if(right!=null)
		{
			right.Inorder();
		}
		
	}
	
	public void preorder()
	{
		System.out.println(data);
		if(left!=null)
		{
			left.preorder();
		}
		
		if(right!=null)
		{
			right.preorder();
		}
		
	}

	public void postorder()
	{
		
		if(left!=null)
		{
			left.postorder();
		}
		
		if(right!=null)
		{
			right.postorder();
		}
		System.out.println(data);
	}
	
	
}
public class BinaryTree1 {
	public static void main(String[] args)
	{
		Node1 n= new Node1(23);
		n.insert(5);
		n.insert(7);
		n.insert(4);
		n.insert(1);
		n.insert(17);
		n.insert(22);
		n.insert(25);
		n.insert(26);
		n.insert(6);
		n.insert(19);
		n.Inorder();
		
	}
	
	
	

}
