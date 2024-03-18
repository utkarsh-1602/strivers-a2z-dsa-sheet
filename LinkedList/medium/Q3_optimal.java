package LinkedList.medium;

/*
    Name : Detect a Cycle in a Linked List

    Problem Statement: Given the head of a singly linked list, detect if there is a loop inside linkedlist, where the last node next pointer don't have null, instead have the reference to the previous node, then there's a loop so return true, else return false.

    Input Format: 
    head = [1,2,3,4,5]
    Result: true

    Input Format: 
    Input: head = [1,2,3,4,5,6]
    Result: false

    Approach: optimal (Tortoise and hare algorithm)

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
 */


public class Q3_optimal{

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

        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
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