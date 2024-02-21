package BinaryTrees.Easy;

import java.util.ArrayList;

/*
    Name : Preorder Traversal of Binary Tree

    Problem Statement: Given a binary tree print the preorder traversal of binary tree.

    Approach : optimal (recursive)

    Time Complexity: O(N)
    Reason: We are traversing N nodes and every node is visited exactly once.

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/preorder-traversal-of-binary-tree/

 */


public class Q2_optimal2 {
    
    static void preorderTraversal(Node root, ArrayList<Integer> preorder){
        if(root == null) return;

        preorder.add(root.data);
        preorderTraversal(root.left, preorder);
        preorderTraversal(root.right, preorder);
    }


    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
                
        /*
                 1
                / \ 
               2   3
              / \
             4   5
        */

        ArrayList<Integer> preorder = new ArrayList<Integer>();
        preorderTraversal(root, preorder);

        for(int i=0; i<preorder.size(); i++){
            System.out.print(preorder.get(i) + " ");
        }
        
    }
}
