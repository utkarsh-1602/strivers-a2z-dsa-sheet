package LinkedList;

/*
    Name : Search an element in a Linked List

    Problem Statement: Given the head of a linked list and an integer value, find out whether the integer is present in the linked list or not. Return true if it is present, or else return false.

    Example 1:
    Input Format: 0->1->2, val = 2
    Result True

    Example 2:
    Input Format: 12->5->8->7, val = 6 
    Result False

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/linked-list/search-an-element-in-a-linked-list/
 */


class Node {

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

public class Q6 {

    static boolean findElement(Node head, int element){

        Node temp = head;
        while(temp.next != null){
            if(temp.data == element){
                return true;
            }
            temp = temp.next;
        }

        return false;

    }

    public static void main(String[] args) {
        
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        System.out.println(findElement(head, 2));

    }   
}
