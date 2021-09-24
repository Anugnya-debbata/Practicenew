class Sol{
static class Node{
	int data;
	Node left,right;
	
};
static boolean isbst(Node root, Node l, Node r){
	if(root==null)
		return true;
	
	if(l!=null && root.data<=l.data)
		return false;
	
	if(r!=null && root.data>= r.data)
		return false;
	
	return isbst(root.left,l,root) && isbst(root.right, root, r);
	
}

static Node newNode(int data){
	Node node=new Node();
	node.data=data;
	node.left=node.right=null;
	return (node);
}

public static void main(String args[]){
	
	Node root=newNode(8);
	root.left=newNode(3);
	root.right=newNode(10);
	root.left.left=newNode(1);
	root.left.right=newNode(6);
	root.left.right.left=newNode(2);
	
	
	if(isbst(root,null,null))
		System.out.println("given tree is bst");
	else
		System.out.println("given tree is not bst");
	
}
}

