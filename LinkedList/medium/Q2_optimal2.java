package LinkedList.medium;

/*
    Name : Reverse a Linked List

    Problem Statement: Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list.

    Input Format: 
    head = [1,2,3,4,5]
    Result: [5,4,3,2,1]

    Input Format: 
    Input: head = [1,2,3,4,5,6]
    Result: [6,5,4,3,2,1]

    Approach: optimal (recursive)

    Time Complexity: O(N)
    Space Complexity: O(1)
    The code uses only a constant amount of additional space, regardless of the linked list’s length. This is achieved by using three pointers (prev, temp and front) to reverse the list without any significant extra memory usage, resulting in constant space complexity, O(1).

    Reference: https://takeuforward.org/data-structure/reverse-a-linked-list/
 */


public class Q2_optimal2{

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

    static Node reverseLL(Node head){

        if(head == null || head.next == null) return head;

        Node newHead = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {12,4,5,7,9};

        Node head = convertArrayToLL(arr);
        head = reverseLL(head);
        printLL(head);

    }
}