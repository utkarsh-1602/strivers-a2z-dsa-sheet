package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
    Name : Preorder Inorder Postorder Traversals in One Traversal

    Problem Statement: Write a program to print Preorder, Inorder, and Postorder traversal of the tree in a single traversal.

    Approach : optimal (iterative) 

    Time Complexity: O(3N)
    Space Complexity: O(4N)

    Reference: https://takeuforward.org/data-structure/preorder-inorder-postorder-traversals-in-one-traversal/

 */


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Pair{
    int num;
    TreeNode node;

    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}

public class Q5_optimal {

    static void allTraversals(TreeNode root, ArrayList<Integer> preorder, ArrayList<Integer> inorder, ArrayList<Integer> postorder){

        if(root == null) return;

        Stack<Pair> stack = new Stack<Pair>();

        // In Java, the push() method of the Stack class only accepts a single argument, which is the item to be pushed onto the stack. Therefore, you cannot directly push both root and 1 as arguments to push() method.
        // stack.push(root, 1);

        // Instead, you need to create an instance of the Pair class using root and 1, and then push this instance onto the stack.
        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {

            Pair p = stack.pop();

            if(p.num == 1){ // root is in the first place in preorder (so we taking 1)
                preorder.add(p.node.data);
                p.num++;
                stack.push(p);

                if(p.node.left != null){
                    stack.push(new Pair(p.node.left, 1));
                }
            }

            else if (p.num == 2){ // root is in the second place in inorder (so we taking 2)
                inorder.add(p.node.data);
                p.num++;
                stack.push(p);

                if(p.node.right != null){
                    stack.push(new Pair(p.node.right, 1));
                }
            }

            else{
                postorder.add(p.node.data);
            }

        }

    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
                
        /*
                 1
                / \ 
               2   3
              / \
             4   5
        */

        ArrayList<Integer> preorder = new ArrayList<Integer>();
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        ArrayList<Integer> postorder = new ArrayList<Integer>();

        allTraversals(root, preorder, inorder, postorder);

        System.out.print("The preorder Traversal is : ");
        for(int x: preorder){
            System.out.print(x + " ");
        }

        System.out.println();


        System.out.print("The Inorder Traversal is : ");
        for(int x: inorder){
            System.out.print(x + " ");
        }

        System.out.println();


        System.out.print("The Postorder Traversal is : ");
        for(int x: postorder){
            System.out.print(x + " ");
        }


        System.out.println();
    }
}
