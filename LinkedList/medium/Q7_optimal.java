/*
    Name : Segregate Even And Odd Nodes In a Linked List

    Problem Statement: You are given the head node of a singly linked list 'head'. Your task is to modify the linked list in such a way that all the even valued nodes appear before the all odd valued node and order of nodes remain the same.

    Sample Input: 
        2 1 3 5 6 4 7 

    Sample Output:
        2 6 4 1 3 5 7

    Approach: optimal

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://www.codingninjas.com/studio/problems/segregate-even-and-odd-nodes-in-a-linked-list_1116100?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */

public class Q7_optimal{

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

     static Node evenOddLL(Node head){
        if(head == null || head.next == null) return head;

        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;
        Node current = head;

        while(current != null) {
            Node nextNode = current.next;

            if(current.data % 2 == 0) {
                if(evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            } else {
                if(oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }
            current = nextNode;
        }

        if(evenStart == null) {
            return oddStart;
        } else {
            evenEnd.next = oddStart;
            if(oddEnd != null) {
                oddEnd.next = null;
            }
            return evenStart;
        }
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {2,1,3,5,6,4,7};

        Node head = convertArrayToLL(arr);
        head = evenOddLL(head);
        printLL(head);

    }
}