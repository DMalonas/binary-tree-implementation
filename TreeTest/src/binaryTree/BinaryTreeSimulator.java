package binaryTree;

import java.util.Scanner;

public class BinaryTreeSimulator {
    public static void main(String[] args) {
    	BinaryTree bt = new BinaryTree();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = bt.insert(root, data);
        }
        scan.close();
        int height = bt.height(root);
        System.out.println(height);
    }
}
