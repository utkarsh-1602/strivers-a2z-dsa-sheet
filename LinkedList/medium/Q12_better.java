package LinkedList.medium;

import java.util.HashSet;

/*
    Name : Find intersection of Two Linked Lists

    Problem Statement: Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

    Input:
    List 1 = [1,3,1,2,4], List 2 = [3,2,4]
    Output: 2
    Explanation: Here, both lists intersecting nodes start from node 2.

    Input:
    List1 = [1,2,7], List 2 = [2,8,1]   
    Output: Null
    Explanation: Here, both lists do not intersect and thus no intersection node is present.

    Approach: better

    Time Complexity: O(N+M)
    Reason: Iterating through list 1 first takes O(n), then iterating through list 2 takes O(m). 

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/find-intersection-of-two-linked-lists/
 */

public class Q12_better{

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

    static Node insertNode(Node head, int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
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


    static Node findIntersectionLL(Node list1, Node list2){

        HashSet<Node> set = new HashSet<Node>();

        while(list1 != null){
            set.add(list1);
            list1 = list1.next;
        }

        while(list2 != null){
            if(set.contains(list2)){
                return list2;
            }
            list2 = list2.next;
        }

        return null;
    }

    public static void main(String[] args) {

        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);

        Node list1 = head;
        head = head.next.next.next;

        Node newNode = null;
        newNode = insertNode(newNode, 3);
        Node list2 = newNode;
        newNode.next = head;


        Node result = findIntersectionLL(list1,list2);

        if(result == null){
            System.out.println("No intersection\n");
        }
        else{
            System.out.println("The intersection point is " + result.data);
        }

    }
}