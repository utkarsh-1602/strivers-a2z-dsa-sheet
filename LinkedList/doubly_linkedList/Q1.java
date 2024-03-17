package LinkedList.doubly_linkedList;

/*
   Name : Convert array to Doubly Linked List
   Problem Statement: Given an array, convert it into a doubly linked list.

    Reference: https://takeuforward.org/data-structure/insert-at-end-of-doubly-linked-list/
 */


 public class Q1{

   public static class Node{
      int data;
      Node next;
      Node back;
   
      // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
      Node(int data, Node next, Node back){
         this.data = data;
         this.next = next;
         this.back = back;
      }
   
   
      // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
      Node(int data){
         this.data = data;
         this.next = null;
         this.back = null;
      }
   }
   static Node convertArrayToDDL(int[] arr){

      Node head = new Node(arr[0]);
      Node prev = head;

      for(int i = 1; i < arr.length; i++){
         Node temp = new Node(arr[i], null, prev);
         prev.next = temp;
         prev = temp;
      }

      return head;

   }


    public static void main(String[] args) {
        
      int[] arr = {12, 5, 6, 8, 4};

      // convert array to doubly linked list
      Node head = convertArrayToDDL(arr);
      
      // Traverse the doubly linked list and print the values
      Node curr = head;
      System.out.println("Doubly linked list: ");
      while (curr != null) {
         System.out.print(curr.data + " ");
         curr = curr.next;
      }

    }
 }