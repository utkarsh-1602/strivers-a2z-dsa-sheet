/*
    Name : Find the Middle node of the linkedList 

    Problem Statement: Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

    Input: head = [1,3,4,7,1,2,6]
    Output: 7

    Input: head = [1,2,3,4,5,6]
    Output: 4
    Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

    Approach: optimal (tortoise and hare algorithm)

    Time Complexity: O(N/2)
    Space Complexity: O(1)

    Reference: https://leetcode.com/problems/middle-of-the-linked-list/description/
 */

public class Q9_optimal{

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

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {1,3,4,7,1,2,6};

        Node head = convertArrayToLL(arr);
        int res = findMiddleNodeLL(head);
        System.out.println(res);

    }
}