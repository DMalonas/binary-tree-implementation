package binaryTree;

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
            System.out.println("root " + root);
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
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}