package LinkedList.medium;

/*
    Name : Check if the given Linked List is Palindrome

    Problem Statement: Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list.

    Input Format: 
    head = [1,2,3,2,1]
    Result: True

    Input Format: 
    Input: head = [1,2,3,2,3]
    Result: false

    Approach: optimal

    Time Complexity: O (2N) 
    The algorithm traverses the linked list twice, dividing it into halves. 
    During the first traversal, it reverses one-half of the list, and during the second traversal, it compares the elements of both halves. 
    As each traversal covers N/2 elements, the time complexity is calculated as O(N/2 + N/2 + N/2 + N/2), which simplifies to O(2N), ultimately representing O(N). 


    Space Complexity: O(1)
    Reference: https://takeuforward.org/data-structure/check-if-given-linked-list-is-plaindrome/
 */


public class Q6_optimal{

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

    static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
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

    static Node reverseLL(Node head){

        if(head == null || head.next == null) return head;

        Node newHead = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    static boolean checkPalindromeLL(Node head){

        if(head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverseLL(slow.next);
        Node first = head;
        Node second = newHead;

        while(second != null){
            if(first.data != second.data){
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }

        reverseLL(newHead);
        return true;

   }

    
    
    public static void main(String[] args) {
        
        int[] arr = {6,5,4,1,2,3,2,1,4,5,6};

        Node head = convertArrayToLL(arr);
        boolean result = checkPalindromeLL(head);
        System.out.println(result);

    }
}