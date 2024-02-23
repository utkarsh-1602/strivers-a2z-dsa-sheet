package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
    Name : Post-Order Traversal Of Binary Tree

    Problem Statement: Given a binary tree print the preorder traversal of binary tree.

    Approach : optimal (iterative) (using one stack )

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

public class Q3_optimal1 {


    static ArrayList<Integer> postorderTraversal(Node root){

        ArrayList<Integer> postorder = new ArrayList<Integer>();

        if(root == null) return postorder;

        Stack<Node> stack = new Stack<>();

        while(root != null || !stack.empty()){

            if(root != null){
                stack.push(root);
                root = root.left; 
            }
            else{

                Node temp = stack.peek().right;

                if(temp == null){
                    temp = stack.peek();
                    stack.pop();
                    postorder.add(temp.data);
                    while(!stack.empty() && temp == stack.peek().right){
                        temp = stack.peek();
                        stack.pop();
                        postorder.add(temp.data);
                    }
                }
                else{
                    root = temp;
                }

            }
        }

        return postorder; 
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


        ArrayList<Integer> postorder = new ArrayList<Integer>();
        postorder = postorderTraversal(root);

        for(int i=0; i<postorder.size(); i++){
            System.out.print(postorder.get(i) + " ");
        }
        
    }
}
