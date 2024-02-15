package LinkedList;

/*
    Name :  Delete Last Node of Linked List

    Problem Statement: Given a linked list, delete the tail of the linked list and print the updated linked list.

    Example 1:
    Input Format: 0->1->2
    Result: 0->1
    Explanation: The tail of the list is the last node. After removing the tail, and updating the linked list, this result is what we get.

    Example 2:
    Input Format: 12->5->8->7
    Result: 12->5->8
    Explanation: Again, after deleting the tail and updating the linked list, the list ends at the second last node, which is the new tail.

    Time Complexity: O(N) for traversing the linked list and updating the tail
    Space Complexity: O(1) as we are not using any extra space.

    Reference: https://takeuforward.org/data-structure/delete-last-node-of-linked-list/
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

public class Q4 {


    static Node deleteTail(Node head){

        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null)
            return null;

        // Create a temporary pointer for traversal
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;

        return head;

    }

    static void printLinkedlist(Node head){
        for(; head != null; head = head.next){
            System.out.print(head.data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        

        // Initialize an array with integer values
        int[] arr = {2, 5, 8, 7};

        // set the head of the LinkedList
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        // Delete the tail of the linked list
        head = deleteTail(head);

        // Print the modified linked list
        printLinkedlist(head);

    }
}
