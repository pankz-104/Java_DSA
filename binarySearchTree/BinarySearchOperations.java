package binarySearchTree;

public class BinarySearchOperations {
	 
	class Node{
		int element;
		Node left;
		Node right;
		public Node(int e, Node l, Node r){
			element = e;
			left = l;
			right = r;
		}	
	}
	
	Node root;
	public BinarySearchOperations(){
		root = null;
	}
	
	// iterative insertion of element into tree
	public void iterativeInsert(Node temproot, int e) {
		Node temp = null; // store reference of root
		
		// till element is present 
		while(temproot != null) {
			temp = temproot;
			// check if key duplicate element found
			if(e == temproot.element)
				return;
			// search and insert into left position
			else if( e < temproot.element)
				temproot = temproot.left;
			// search and insert into right position 
			else if(e > temproot.element)
				temproot = temproot.right;
		}
		
		Node n  = new Node(e, null, null);
		// if root is not empty, insert either at left or at right position
		if(root != null) {
			if(e < temp.element)
				temp.left = n;
			else
				temp.right = n;
		}
		// if root is empty, insert the value at the root node
		else 
			root = n;
	}
	
	// recursively inserting element 
	public Node recursiveInsert(Node temproot, int e) {
		if(temproot != null) {
			if(e < temproot.element)
				temproot.left = recursiveInsert(temproot.left, e);
			else if(e > temproot.element)
				temproot.right = recursiveInsert(temproot.right, e);
		}
		else 
		{
			Node n = new Node(e, null, null);
			temproot = n;
		}
		return temproot;
	}
	
	public boolean delete(int e) {
		Node p = root;
		Node pp = null;  	// reference to node which we are deleting
		// search for element to be deleted
		while( p != null && p.element != e) {
			pp = p;
			if(e < p.element)
				p = p.left;
			else 
				p = p.right;
		}
		// check for presence of element 
		if(p == null)
			return false; 	// not present
		
		// check if both the left and right subtrees are present or not 
		if(p.left != null && p.right != null) {
			Node s = p.left;	// points to the left element 
			Node ps = p;	// node reference to root
			
			// element at right position of left subtree is largest 
			// points to largest element of the left subtree 
			while(s.right != null) {
				ps = s;
				s = s.right;
			}
			p.element = s.element;  // make the largest element as root
			p = s;                  // s is referenced to p -- root element 
			pp = ps;				// ps is referenced as pp
		}
		
		// for condition when node has either Node has left subtree or right subtree 
		Node c = null;
		if(p.left != null)
			c = p.left; 	// left subtree 
		else 
			c = p.right;	// right subtree 
		
		// check if node is root node 
		if(p == root)
			root = null;
		else 
			if(p == p.left)
				pp.left = c;
			else 
				pp.right = c;
		return true;
	}
	
	// iterative searching of elements 
	public boolean iterativeSearch(int key) {
		Node troot = root;
		while(troot != null) {
			if(key == troot.element) 
				return true;
			else if (key < troot.element)
				troot = troot.left;
			else if (key > troot.element)
				troot = troot.right;
		}
		return false;
	}
	
	// recursive searching of element 
	public boolean recursiveSearch(Node troot, int key) {
		if(troot != null) {
			if(key == troot.element)
				return true;
			else if(key < troot.element)
				return recursiveSearch(troot.left, key);
			else if(key > troot.element)
				return recursiveSearch(troot.right, key);
		}
		return false;
	}
	
	// print element by using inorder traversal 
	// left, root and right
	public void inOrder(Node temproot) {
		if(temproot != null) {
			inOrder(temproot.left);
			System.out.println(temproot.element+" ");
			inOrder(temproot.right);
		}
	}
	
	// print elements using preOrder traversal
	// root, left and right
	public void preOrder(Node temproot) {
		if(temproot != null) {
			System.out.println(temproot.element);
			preOrder(temproot.left);
			preOrder(temproot.right);
		}
	}
	
	// print elements using postOrder traversal
	// left, right and root
	public void postOrder(Node temproot) {
		if(temproot != null) {
			postOrder(temproot.left);
			postOrder(temproot.right);
			System.out.println(temproot.element);
		}
	}
	
	// count number of nodes in a tree 
	public int count(Node temproot) {
		if(temproot != null) {
			int x = count(temproot.left);
			int y = count(temproot.right);
			return x + y + 1; // 1 -- for adding the root element 
		}
		return 0;
	}
	
	// count the height of the tree
	public int height(Node temproot) {
		if(temproot != null) {
			int x = height(temproot.left);
			int y = height(temproot.right);
			
			// returning the greatest height either in left or right subtree
			if(x > y)
				return x + 1;
			else 
				return y + 1;
		}
		return 0;
	}
	
	public static void main(String [] args) {
		BinarySearchOperations bst = new BinarySearchOperations();
		bst.iterativeInsert(bst.root, 10);
		bst.iterativeInsert(bst.root, 20);
		bst.iterativeInsert(bst.root, 40);
		bst.iterativeInsert(bst.root, 30);
		bst.iterativeInsert(bst.root, 50);
		bst.iterativeInsert(bst.root, 60);
		bst.iterativeInsert(bst.root, 70);
		bst.iterativeInsert(bst.root, 80);
		System.out.println("Element deleted :: "+bst.delete(20));
//		if(bst.iterativeSearch(10))
//			System.out.println("element found");
//		else
//			System.out.println("element not found");
//		
//		if(bst.recursiveSearch(bst.root, 110))
//			System.out.println("element found");
//		else 
//			System.out.println("element not found");
		System.out.println("Element 10 search :: "+bst.iterativeSearch(10));
		System.out.println("ELement 11 search :: "+bst.recursiveSearch(bst.root, 11));
		
		System.out.println("Inorder traversal :: ");
		bst.inOrder(bst.root);
		
		System.out.println("Preorder traversal :: ");
		bst.preOrder(bst.root);
		
		System.out.println("postorder traversal :: ");
		bst.postOrder(bst.root);
		
		System.out.println("Number of nodes :: "+bst.count(bst.root));
		System.out.println("Height of tree :: "+bst.height(bst.root));
	}
}