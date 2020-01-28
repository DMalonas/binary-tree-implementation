package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeSimulator {
	
	
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int furthestIndex = 0;
        int i;
        for (i = 0; i < game.length; i++) {
            if (game[i] == 0) {
                continue;
            }
            break;
        }
        // System.out.println("i " + i);

        furthestIndex = i - 1;
        // System.out.println("length of arr " + game.length + " " + furthestIndex + " furthestIndex");
        if ((furthestIndex + leap) >= game.length -1) {
            return true;
        }

        return  false;
    }
    
    
    public static void main(String[] args) {
    	
    	int[] asdf = {0, 1, 0, 1, 0, 1};
    	System.out.println(canWin(2, asdf));
        ArrayList<int[]> lists = new ArrayList<int[]>();
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            System.out.println(" i  " + i );
            
            int cols = sc.nextInt();
            int[] temp = new int[cols];
            for (int j = 0; j < cols; j++) {
                temp[i] = sc.nextInt();
            }
            lists.add(temp);
        }
        System.out.println(lists.toString());
        int queries = sc.nextInt();
        int idxR = -1;
        int idxC = -1;
        for (int i = 0; i < queries; i++) {
        }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    	BinaryTree bt = new BinaryTree();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = bt.insert(root, data);
        }
        //Check tree length
        int height = bt.height(root);
        System.out.println("height:: " + height);
        
        //find lowest common ancestor
        int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = bt.lowestCommonAncenstor(root,v1,v2);
        System.out.println("Lowest common ancestor for " + v1 + " and " + v2 + ":: " + ans.data);
    }
}
