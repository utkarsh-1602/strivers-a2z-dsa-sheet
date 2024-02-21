package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
    Name : Inorder Traversal of Binary Tree

    Problem Statement: Given a Binary Tree. Find and print the inorder traversal of Binary Tree.

    Approach : bruteforce  

    Time Complexity: O(N).
    Reason: We are traversing N nodes and every node is visited exactly once.

    Space Complexity: O(N)

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

public class Q1_optimal1{

    static ArrayList<Integer> inorderTraversal(Node curr){

        ArrayList<Integer> inOrder = new ArrayList<>();
        Stack <Node> stack = new Stack<>(); 
        // Declaring a stack as type Node means that the stack will specifically contain elements of the Node type. In other words, each element pushed onto the stack must be an instance of the Node class.

        while(true){ // infinite loop
            if(curr != null){
                stack.push(curr); 
                curr = curr.left;
            }
            else{
                if(stack.isEmpty()) break; 
                curr = stack.peek(); 
                inOrder.add(curr.data); 
                stack.pop();
                curr = curr.right; 
            }
        }

        return inOrder; 

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

        ArrayList<Integer> inorder = inorderTraversal(root);

        for(int i=0; i<inorder.size(); i++){
            System.out.print(inorder.get(i) + " ");
        }
        
    }
}