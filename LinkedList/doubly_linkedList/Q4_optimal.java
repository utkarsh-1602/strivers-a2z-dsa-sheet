package LinkedList.doubly_linkedList;

/*
   Name : Reverse a Doubly Linked List

   Problem Statement: Given a doubly linked list of size ‘N’ consisting of positive integers, your task is to reverse it and return the head of the modified doubly linked list.

    Example 1
    Input:  1 <-> 2 <-> 3 <-> 4
    Output: 4 <-> 3 <-> 2 <-> 1

    Time Complexity: O(N)
    Space Complexity: O(1)

   Reference: https://takeuforward.org/data-structure/reverse-a-doubly-linked-list/
 */

public class Q4_optimal {

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

  static void printDDL(Node head){
    while(head != null){
        System.out.print(head.data + " ");
        head = head.next;
    }
    System.out.println();
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

  static Node reverseDDL(Node head){

    if(head == null) return null;
    if(head.next == null) return head;

    Node curr = head;
    Node last = null;

    while(curr != null){
      last = curr.prev;
      curr.prev = curr.next;
      curr.next = last;
      curr = curr.prev;
    }

    head = last.prev;

    return head;

  }


  public static void main(String[] args) {

    int[] arr = {12, 5, 6, 8, 4};
    // Convert the array to a doubly linked list
    Node head = convertArr2DLL(arr);
    head = reverseDDL(head);
    printDDL(head);

  }   
}
