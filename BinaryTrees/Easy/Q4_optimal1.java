package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
    Name : Level Order Traversal of a Binary Tree

    Problem Statement: Level order traversal of a binary tree. Given the root node of the tree and you have to print the value of the level of the node by level.

    Approach : optimal (iterative) using two stacks 

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

public class Q4_optimal1 {


    static ArrayList<Integer> postorderTraversal(Node root, ArrayList<Integer> postorder){

        if(root == null) return postorder; 

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            root = s1.peek();
            s1.pop();
            s2.push(root);

            if(root.left != null){
                s1.push(root.left);
            }
            if(root.right != null){
                s1.push(root.right);
            }
        }

        while(!s2.isEmpty()) {
            postorder.add(s2.peek().data);
            s2.pop();
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


        ArrayList<Integer> postorder = new ArrayList<>();
        postorderTraversal(root, postorder);

        for(int i=0; i<postorder.size(); i++){
            System.out.print(postorder.get(i) + " ");
        }
        
    }
}
