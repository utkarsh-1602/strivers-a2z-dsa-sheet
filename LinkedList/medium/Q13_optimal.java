package LinkedList.medium;

/*
    Name : Add two numbers represented as Linked Lists

    Problem Statement: Given the heads of two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

    Input:
    num1  = 243, num2 = 564
    l1 = [2,4,3]
    l2 = [5,6,4]    
    Result: sum = 807; L = [7,0,8]

    Input Format: 
    l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Result: sum = 10009998; L = [8,9,9,9,0,0,0,1]
    Explanation: Since the digits are stored in reverse order, reverse the numbers first to get the original number and then add them as → 9999999 + 9999 = 8999001.
    Approach: optimal 

    Time Complexity: O(max(m,n)). Assume that m and n represent the length of l1 and l2 respectively, the algorithm above iterates at most max(m,n) times.
    Space Complexity: O(max(m,n)). The length of the new list is at most max(m,n)+1.



    Reference: https://takeuforward.org/data-structure/add-two-numbers-represented-as-linked-lists/
 */

public class Q13_optimal{

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

    static Node addTwoLL(Node list1, Node list2){

        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        int carry = 0;

        while(list1 != null || list2 != null || carry != 0){

            int digit1 = (list1 != null) ? list1.data : 0;
            int digit2 = (list2 != null) ? list2.data : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            list1 = (list1 != null) ? list1.next : null;
            list2 = (list2 != null) ? list2.next : null;

        }
        
        Node result = dummyNode.next;
        dummyNode.next = null;
        return result;
    }

    
    public static void main(String[] args) {
        
        int[] arr = {2,4,3};
        int[] arr2 = {5,6,4};

        Node list1 = convertArrayToLL(arr);
        Node list2 = convertArrayToLL(arr2);

        Node result = addTwoLL(list1, list2);
        printLL(result);
    }
}