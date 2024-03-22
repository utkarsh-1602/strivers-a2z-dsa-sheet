/*
    Name : Segregate Even And Odd Nodes In a Linked List

    Problem Statement: You are given the head node of a singly linked list 'head'. Your task is to modify the linked list in such a way that all the even valued nodes appear before the all odd valued node and order of nodes remain the same.

    Sample Input: 
        2 1 3 5 6 4 7 

    Sample Output:
        2 6 4 1 3 5 7

    Approach: bruteforce

    Time Complexity: O(3N)
    Space Complexity: O(N)

    Reference: https://www.codingninjas.com/studio/problems/segregate-even-and-odd-nodes-in-a-linked-list_1116100?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */

import java.util.ArrayList;

public class Q7_bruteforce{

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
       
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Node temp_odd = head;
        Node temp_even = head;

        while(temp_even != null){
            if(temp_even.data % 2 == 0){
                arr.add(temp_even.data);
            }
            temp_even = temp_even.next;
        }

        while(temp_odd != null){
            if(temp_odd.data % 2 != 0){
                arr.add(temp_odd.data);
            }
            temp_odd = temp_odd.next;
        }

        Node curr = head;

        for(int i = 0; i < arr.size(); i++){
            curr.data = arr.get(i);
            curr = curr.next;
        }

        return head;
   }

    
    
    public static void main(String[] args) {
        
        int[] arr = {2,1,3,5,6,4,7};

        Node head = convertArrayToLL(arr);
        head = evenOddLL(head);
        printLL(head);

    }
}