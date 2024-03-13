package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
    Name : Preorder Traversal of Binary Tree

    Problem Statement: Given a binary tree print the preorder traversal of binary tree.

    Approach : optimal (iterative)

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

public class Q2_optimal1 {

    static ArrayList<Integer> preorderTraversal(Node root){

        ArrayList<Integer> preorder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if(root == null) return preorder;

        stack.push(root);

        while(!stack.isEmpty()){
            Node topNode = stack.peek();
            preorder.add(topNode.data);
            stack.pop();
            if(topNode.right != null){
                stack.push(topNode.right);
            }
            if(topNode.left != null){
                stack.push(topNode.left);
            }
        }

        return preorder; 
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

        ArrayList<Integer> preorder = preorderTraversal(root);

        for(int i=0; i<preorder.size(); i++){
            System.out.print(preorder.get(i) + " ");
        }
        
    }

}
