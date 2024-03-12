package BinaryTrees.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
    Name : Level-Order Traversal Of Binary Tree

    Problem Statement: Level order traversal of a binary tree. Given the root node of the tree and you have to print the value of the level of the node by level.

    Approach : optimal 

    Time Complexity: O(N)
    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/level-order-traversal-of-a-binary-tree/

 */

class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Q4_optimal1 {


    static ArrayList<Integer> levelOrderTraversal(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        // it is a linkedlist where each node is a TreeNode 
        
        ArrayList<Integer> levelOrder = new ArrayList<>();

        if(root == null) return levelOrder;
        
        queue.offer(root);

        while (!queue.isEmpty()) {
            
            if(queue.peek().left != null) {
                queue.offer(queue.peek().left);
            }


            if(queue.peek().right != null) {
                queue.offer(queue.peek().right);
            }

            levelOrder.add(queue.poll().data);

        }

        return levelOrder;

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

        ArrayList<Integer> inorder = levelOrderTraversal(root);

        for(int i=0; i<inorder.size(); i++){
            System.out.print(inorder.get(i) + " ");
        }
        
    }
}
