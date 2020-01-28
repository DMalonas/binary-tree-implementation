import java.util.*;


import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {

	
	public static Node lowestCommonAncenstor(Node root, int v1, int v2) {
      	// Write your code here.
        if(root.data < v1 && root.data < v2){
            return lowestCommonAncenstor(root.right,v1,v2);
        }

        //Bigger than both
        if(root.data > v1 && root.data > v2){
            return lowestCommonAncenstor(root.left,v1,v2);
        }

        //Else solution already found
        return root;
    }
	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
		System.out.println("root height " + root);
	    if (root == null) { 
	       return 0;
	    }   
        Queue<Node> q = new LinkedList(); 
        System.out.print(root.data);
        q.add(root); 
        int height = 0; 
   
        while (true)  
        { 
            int nodeCount = q.size(); 
            if (nodeCount == 0) {
                return height - 1;
            }
            height++; 
   

            while (nodeCount > 0)  
            { 
                Node newnode = q.peek(); 
                q.remove(); 
                if (newnode.left != null) 
                    q.add(newnode.left); 
                if (newnode.right != null) 
                    q.add(newnode.right); 
                nodeCount--; 
            } 
        } 
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
        	System.out.println("null");
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            	System.out.println("left");
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            	System.out.println("right");
            }
          //  System.out.println("root " + root);
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int height = height(root);
        System.out.println(height);
        
        
        //find lowest common ancestor
        int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lowestCommonAncenstor(root,v1,v2);
        System.out.println("Lowest common ancestor for " + v1 + " and " + v2 + ":: " + ans.data);

    }	
}