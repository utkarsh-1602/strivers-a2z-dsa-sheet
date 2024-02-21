package BinaryTrees.Easy;

import java.util.ArrayList;

/*
    Name : Inorder Traversal of Binary Tree

    Problem Statement: Given a Binary Tree. Find and print the inorder traversal of Binary Tree.

    Approach : optimal  

    Time Complexity: 

    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/inorder-traversal-of-binary-tree/

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


public class Q1_optimal2 {

    static void inorderTraversal(Node root, ArrayList<Integer> inorder){

        if(root == null){
            return;
        }

        inorderTraversal(root.left, inorder);
        inorder.add(root.data);
        inorderTraversal(root.right, inorder);
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


        ArrayList<Integer> inorder = new ArrayList<Integer>();
        inorderTraversal(root, inorder);


        for(int i=0; i<inorder.size(); i++){
            System.out.print(inorder.get(i) + " ");
        }
        
    }
}
