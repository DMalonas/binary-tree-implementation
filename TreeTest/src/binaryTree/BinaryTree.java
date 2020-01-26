package binaryTree;

import java.util.*;
import java.io.*;



class BinaryTree {
	public Node lca(Node root, int v1, int v2) {
      	// Write your code here.
        if(root.data < v1 && root.data < v2){
            return lca(root.right,v1,v2);
        }

        //Bigger than both
        if(root.data > v1 && root.data > v2){
            return lca(root.left,v1,v2);
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
	public int height(Node root) {
		//System.out.println("root height " + root);
	    if (root == null) { 
	       return 0;
	    }   
        Queue<Node> q = new LinkedList(); 
        //System.out.print(root.data);
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

	public Node insert(Node root, int data) {
        if(root == null) {
        	//System.out.println("null");
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
            //System.out.println("root " + root);
            return root;
        }
    }	
}