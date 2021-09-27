class Node7{
	int data;
	int height;
	Node left;
	Node right;
	
	Node7(int d){
		data=d;
		height=1;
	}
}

class AVLTree{
	
	Node root;
	
	int height(Node N){
		if(N==null)
			return 0;
		return N.height;
	}
	
	int max(int a, int b){
		
		return (a>b)? a:b;
	}
	
	Node Rightrotate(Node y){
		Node x=y.left;
		Node T2= x.right;
		
		x.right=y;
		y.left=T2;
		
		x.height=max(height(x.left), height(x.right))+1;
		y.height=max(height(y.left), height(y.right))+1;
		
		return x;		
	}
	
	
	Node Leftrotate(Node x){
		Node y=x.right;
		Node T2=y.left;
		
		y.left=x;
		x.right=T2;
		
		y.height=max(height(y.left), height(y.right))+1;
		x.height=max(height(x.left), height(x.right))+1;
		
		return y;
	}
	int getBalanacefactor(Node node){
		if(node ==null)
			return 0;
		return height(node.left)- height(node.right);
	}
	
	Node insertNode(Node node, int item){
		if(node==null)
			return (new Node(item));
		
		if(item<node.data)
			node.left=insertNode(node.left,item);
		else if(item>node.data)
			node.right=insertNode(node.right,item);
		else
			return node;
	
	
	node.height= 1+ max(height(node.left),height(node.right));
	
	int balancefactor= getBalanacefactor(node);
	if(balancefactor>1){
		
	if(item < node.left.data){
		return Rightrotate(node);
	}
	else if(item> node.right.data){
		node.left=Leftrotate(node.left);
	return Rightrotate(node);
	}
	}
	
	if(balancefactor<-1){
		if(item> node.right.data){
			return Leftrotate(node);
		}
		else if(item<node.right.data){
			node.right=Rightrotate(node.right);
			return Leftrotate(node);
		}
	}
	return node;
	}
	
	
	Node nodewithminimumvalue(Node node){
		
		Node current=node;
		
		while(current.left!=null)
			
			current=current.left;
		return current;
	}
	
	void preorder(Node node){
		if(node!=null){
			System.out.print("--->"+node.data);
		preorder(node.left);
		preorder(node.right);
		}
		
	}
	
	private void printTree(Node currPtr, String indent, boolean last) {
	    if (currPtr != null) {
	      System.out.print(indent);
	      if (last) {
	        System.out.print("R----");
	        indent += "   ";
	      } else {
	        System.out.print("L----");
	        indent += "|  ";
	      }
	      System.out.println(currPtr.data);
	      printTree(currPtr.left, indent, false);
	      printTree(currPtr.right, indent, true);
	    }
	  }

	  // Driver code
	  public static void main(String[] args) {
	    AVLTree tree = new AVLTree();
	    tree.root = tree.insertNode(tree.root, 33);
	    tree.root = tree.insertNode(tree.root, 13);
	    tree.root = tree.insertNode(tree.root, 53);
	    tree.root = tree.insertNode(tree.root, 9);
	    tree.root = tree.insertNode(tree.root, 21);
	    tree.root = tree.insertNode(tree.root, 61);
	    tree.root = tree.insertNode(tree.root, 8);
	    tree.root = tree.insertNode(tree.root, 11);
	    tree.printTree(tree.root, "", true);
	    
	    tree.preorder(tree.root);
		
		
		
	}                              
}