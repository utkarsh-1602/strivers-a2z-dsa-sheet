package LinkedList.doubly_linkedList;

/*
   Name : Delete Last Node of a Doubly Linked List

   Problem Statement: Given a Doubly Linked List. Delete the last of a Doubly Linked List.

    Example 1: DLL: 1 <-> 3 <-> 4 <-> 1
    Result: DLL: 1 <-> 3 <-> 4

    Time Complexity: The time complexity of removing the last node from a doubly linked list depends on whether you have a reference to the last node or not. If you have a reference to the last node, the removal operation can be performed in O(1) constant time. However, if you don't have a reference to the last node and need to traverse the list to find it, the time complexity would be O(n), where n is the number of nodes in the doubly linked list.

    In this case, we are traversing the DDL, so time complexity is O(N) 
    
    Space Complexity: O(1)

   Reference: https://takeuforward.org/data-structure/delete-last-node-of-a-doubly-linked-list/
 */

public class Q3 {

    public static class Node{

        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    static Node convertArr2DLL(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;

    }


    static void printDDL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node deleteLastNode(Node head){

        if(head == null || head.next == null) return null;

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        Node secondLastNode = curr.prev;
        secondLastNode.next = null;
        curr.prev = null;
        
        return head;

    }


    public static void main(String[] args) {

        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2DLL(arr);

        head = deleteLastNode(head);
        printDDL(head);

    }
    
}
