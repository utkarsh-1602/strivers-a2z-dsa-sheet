/*
    Name : Sort LinkedList

    Problem Statement: Given the head of a linked list, return the list after sorting it in ascending order.

    Input: head = [4,2,1,3]
    Output: [1,2,3,4]

    Input: head = [-1,5,3,4,0]
    Output: [-1,0,3,4,5]

    Input: head = []
    Output: []

    Approach: optimal

    Time Complexity: O(NLogN)
    Space Complexity: O(1)

    Reference: https://leetcode.com/problems/sort-list/description/
 */

public class Q10_optimal{

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

    static Node findMiddleNode(Node head){

        Node slow = head, fast = head;
        while(fast.next.next != null){ 
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    static Node mergeTwoLists(Node list1, Node list2){

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (list1 != null && list2 != null) {
            if(list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }

        return dummyNode.next;

    }

    static Node sortLL(Node head){

        if(head == null || head.next == null) return head;

        Node middleNode = findMiddleNode(head);

        Node left = head;
        Node right = middleNode.next;
        middleNode.next = null;

        left = sortLL(left);
        right = sortLL(right);

        return mergeTwoLists(left, right);

    }

    public static void main(String[] args) {
        
        int[] arr = {4,2,1,3};

        Node head = convertArrayToLL(arr);
        head = sortLL(head);
        printLL(head);

    }
}