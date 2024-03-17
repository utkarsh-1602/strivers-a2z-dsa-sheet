package LinkedList.doubly_linkedList;

/*
   Name : Insert at end of Doubly Linked List
   Problem Statement: Given a doubly linked list, and a value ‘k’, insert a node having value ‘k’ at the end of the doubly linked list.

    Input Format:
    DLL: 1 <-> 2 <-> 3 <-> 4
    Value to be Inserted: 6
    Result: DLL: 1 <-> 2 <-> 3 <-> 4 <-> 6

    Time Complexity: O(N) The time complexity of this insertion operation is O(N) because we have to traverse the entire list to reach its tail. The complexity would be O(1) if we were given the tail node directly.
    Space Complexity: O(1)  The space complexity is also O(1) because we are notusing any extradatastructures to do the operations apart from creating a single new node.




   Reference: https://takeuforward.org/data-structure/insert-at-end-of-doubly-linked-list/
 */



public class Q2 {

    public static class Node{
        int data;
        Node next;
        Node prev;
    
        Node(int data, Node next, Node prev) {
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

    static Node convertToDDL(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;

    }

    static Node insertAtEnd(Node head, int value){

        Node newNode = new Node(value);

        // if the DDL is empty, then we will return the new Node 
        if(head == null) return newNode;

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }

    public static void main(String[] args) {
        
        int[] arr = {13,2,9,4};
        int insertValue = 5;

        Node head = convertToDDL(arr);
        Node curr = head;

        curr = insertAtEnd(curr, insertValue);

        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();

    }
}
