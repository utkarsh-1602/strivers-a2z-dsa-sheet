package LinkedList.medium;

import java.util.HashMap;

/*
    Name : Detect a Cycle in a Linked List

    Problem Statement: Given the head of a singly linked list, detect if there is a loop inside linkedlist, where the last node next pointer don't have null, instead have the reference to the previous node, then there's a loop so return true, else return false.

    Input Format: 
    head = [1,2,3,4,5]
    Result: true

    Input Format: 
    Input: head = [1,2,3,4,5,6]
    Result: false

    Approach: bruteforce

    Time Complexity: O(N * 2 * log(N))
    
    The algorithm traverses the linked list once, performing hashmap insertions and searches in the while loop for each node. The insertion and search operations in the unordered_map have a worst-case time complexity of O(log(N)). As the loop iterates through N nodes, the total time complexity is determined by the product of the traversal (O(N)) and the average-case complexity of the hashmap operations (insert and search), resulting in O(N * 2 * log(N)). 

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
 */


public class Q3_bruteforce{

    public static class Node {
        int data;
        Node next;
    
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node convertArrayToLL(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;
  
        for(int i = 1; i < arr.length; i++){
           Node temp = new Node(arr[i], null);
           prev.next = temp;
           prev = temp;
        }
  
        return head;
  
     }

    static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static boolean detectCycle(Node head){

        if(head == null || head.next == null) return false;

        HashMap<Node, Integer> map = new HashMap<Node, Integer>();
        
        Node temp = head;
        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp, 1);
            temp = temp.next;
        }

        return false;

    }
    
    
    public static void main(String[] args) {
        
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // creating the loop 
        fifth.next = third;

        boolean result = detectCycle(head);
        System.out.println(result);

    }
}