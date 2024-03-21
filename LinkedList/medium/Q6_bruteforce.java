package LinkedList.medium;

import java.util.Stack;

/*
    Name : Check if the given Linked List is Palindrome

    Problem Statement: Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list.

    Input Format: 
    head = [1,2,3,2,1]
    Result: True

    Input Format: 
    Input: head = [1,2,3,2,3]
    Result: false

    Approach: bruteforce

    Time Complexity: O(2N) 
    Space Complexity: O(N)
    Reference: https://takeuforward.org/data-structure/check-if-given-linked-list-is-plaindrome/
 */


public class Q6_bruteforce{

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

    static boolean checkPalindromeLL(Node head){

        if(head == null || head.next == null) return true;

        Stack<Integer> stack = new Stack<Integer>();
        
        Node temp = head;

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        System.out.println(stack);

        while(!stack.isEmpty()){

            int poppedElement = stack.pop();

            if(temp.data == poppedElement){
                temp = temp.next;
                continue;
            }
            else{
                return false;
            }
        }
    
        return true;

    }

    
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,2,1};

        Node head = convertArrayToLL(arr);
        boolean result = checkPalindromeLL(head);
        System.out.println(result);

    }
}