package LinkedList;

/*
    Name : Find the Length of a Linked List

    Problem Statement: Given the head of a linked list, print the length of the linked list.

    Input Format: 0->1->2
    Result: 3

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/linked-list/find-the-length-of-a-linked-list/
 */


class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null; 
    }
}


public class Q5 {
    
    static int findLength(Node head){

        int count = 0;
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
                
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(findLength(head));
    }

}
