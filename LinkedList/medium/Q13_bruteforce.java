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

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/add-two-numbers-represented-as-linked-lists/
 */

public class Q13_bruteforce{

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

    static Node reversedLL(Node head){

        if(head == null || head.next == null    ) return head;

        Node last = null;
        Node curr = head;

        while(curr != null){
            Node nextOne = curr.next;
            curr.next = last;
            last = curr;
            curr = nextOne;
        }

        return last;
    }

    static Node addTwoLL(Node list1, Node list2){

        if(list1 == null){
            return reversedLL(list2);   
        }
        if(list2 == null){
            return reversedLL(list1);
        }

        if(list1.data == 0 && list2.data == 0){
            return list1;
        }


        Node reversedList1 = reversedLL(list1);
        Node reversedList2 = reversedLL(list2);
        
        long res = 0;
        long res2 = 0;

        printLL(reversedList1);
        System.out.print("This is reversed list 2 : ");
        printLL(reversedList2);

        while (reversedList1 != null) {
            
            res = res*10 + reversedList1.data;
            reversedList1 = reversedList1.next;
        }

        while (reversedList2 != null) {
            
            res2 = res2*10 + reversedList2.data;
            reversedList2 = reversedList2.next;
        }

        System.out.println(res);
        System.out.println("Reversed2: " + res2);


        long sum = res + res2;
        System.out.println(sum);

        Node finalNode = new Node(-1);
        Node temp = finalNode;

        while(sum > 0){

            int digit = (int) (sum % 10);

            if(temp.next == null){
                temp.next = new Node(digit);
                temp = temp.next;
            }
            else{
                temp.next = new Node(digit);
                temp = temp.next;

            }
            sum = sum / 10;
        }

        return finalNode.next;

    }

    
    public static void main(String[] args) {
        
        int[] arr = {9};
        int[] arr2 = {1,9,9,9,9,9,9,9,9,9};

        Node list1 = convertArrayToLL(arr);
        Node list2 = convertArrayToLL(arr2);

        
        Node result = addTwoLL(list1, list2);
        printLL(result);
    }
}