package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
    Name : Post-Order Traversal Of Binary Tree

    Problem Statement: Given a binary tree print the preorder traversal of binary tree.

    Approach : optimal (recursive)

    Time Complexity: O(N)
    Reason: We are traversing N nodes and every node is visited exactly once.

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/preorder-traversal-of-binary-tree/

 */


class Node{
    int data;
    Node left, right;
    Node (int data){
        this.data = data;
        left = null;
        right = null; 
    }
}

public class Q3_optimal2 {


    static void postorderTraversal(Node root, ArrayList<Integer> postorder){

        if(root == null) return;

        postorderTraversal(root.left, postorder);
        postorderTraversal(root.right, postorder);
        postorder.add(root.data);

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


        ArrayList<Integer> postorder = new ArrayList<>();
        postorderTraversal(root, postorder);

        for(int i=0; i<postorder.size(); i++){
            System.out.print(postorder.get(i) + " ");
        }
        
    }
}
