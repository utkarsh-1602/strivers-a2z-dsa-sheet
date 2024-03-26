package LinkedList.medium;

/*
    Name : Find middle node in a Linked List

    Problem Statement: Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

    Input Format: 
    ( Pointer / Access to the head of a Linked list )
    head = [1,2,3,4,5]
    Result: [3,4,5]
    ( As we will return the middle of Linked list the further linked list will be still available )

    Input Format: 
    Input: head = [1,2,3,4,5,6]
    Result: [4,5,6]
    Explanation: 
    Since the list has two middle nodes with values 3 and 4, we return the second one.

    Approach: optimal (tortoise-hare-approach)

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/find-middle-element-in-a-linked-list/
 */


public class Q1_optimal{

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

    static Node findMiddleNode(Node head){

        Node slow = head, fast = head;
        while(fast != null && fast.next != null){ 
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
    
    public static void main(String[] args) {
        
        int[] arr = {12,4,5,7,9};

        Node head = convertArrayToLL(arr);
        head = findMiddleNode(head);
        printLL(head);

    }
}