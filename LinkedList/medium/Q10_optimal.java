/*
    Name : Delete the Middle node of the linkedList 

    Problem Statement: You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
    The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

    Input: head = [1,3,4,7,1,2,6]
    Output: [1,3,4,1,2,6]

    Input: head = [1,2,3,4]
    Output: [1,2,4]

    Input: head = [2,1]
    Output: [2]

    Approach: optimal

    Time Complexity: 
    To find middlenode of LinkedList : O(N/2)
    Deleting the middle node of the linked list: O(1)
    Overall time Complexity : O(N/2)

    Space Complexity: O(1)

    Reference: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
 */

public class Q10_optimal{

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

     static int findMiddleNodeLL(Node head){

        if(head == null || head.next == null) return head.data;
        
        Node slow = head;
        Node fast = head;
        int count = 0;

        while(fast != null && fast.next != null){
            count++;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return count;
    }

     static Node deleteMiddleNodeLL(Node head){

        if(head == null || head.next == null) return head;

        int pivot = findMiddleNodeLL(head) - 1;
        Node temp = head;

        while(pivot > 0){
            temp = temp.next;
            pivot--;
        }

        Node middleNode = temp.next;
        temp.next = temp.next.next;
        middleNode.next = null;        

        return head;

    }

    public static void main(String[] args) {
        
        int[] arr = {1,3,4,7,1,2,6};

        Node head = convertArrayToLL(arr);
        head = deleteMiddleNodeLL(head);
        printLL(head);

    }
}