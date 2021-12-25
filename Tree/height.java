package Tree;

public class height {
	static int heightTree(Node root) {
		if(root == null) 
			return 0;
		else
			return Math.max(heightTree(root.left), heightTree(root.right))+1;
	}
	public static void main(String[] args) {
		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	System.out.print(heightTree(root));

	}

}
