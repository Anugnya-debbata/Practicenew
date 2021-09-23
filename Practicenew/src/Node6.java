class Node6{
	int data;
	Node left;
	Node right;
	
	
	Node6(int d){
		data=d;
		left=right=null;
	}
}

class Binaryst{
	Node root;
	
	boolean isbst(Node node){
		
		if(node==null)
			return true;
		
		if(node.left!=null && node.left.data>node.data)
			return false;
		
		if(node.right!=null && node.right.data<node.data)
			return false;
		
		
		if(!isbst(node.left)|| !isbst(node.right))
			return false;
		return true;
	}
	
	public static void main(String args[]){
		
		Binaryst tree=new Binaryst();
		
		tree.root=new Node(8);
		tree.root.left=new Node(3);
		tree.root.right=new Node(10);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(6);
		tree.root.left.right=new Node(4);
		
		if(tree.isbst(tree.root))
			System.out.println("is binary search tree");
		else
			System.out.println("is not binary search tree");
		
		
	}
	
	
	
}
