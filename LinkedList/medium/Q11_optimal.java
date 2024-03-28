package LinkedList.medium;

/*
    Name : Sort linked list of 0s 1s 2s

    Problem Statement: Given a linked list of 'N' nodes, where each node has an integer value that can be 0, 1, or 2. You need to sort the linked list in non-decreasing order and the return the head of the sorted list.

    Input: 1 0 2 1 0 2 1
    Output: 0 0 1 1 1 2 2

    Approach: bruteforce

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://www.naukri.com/code360/problems/sort-linked-list-of-0s-1s-2s_1071937?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */

public class Q11_optimal{

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


    static Node sortList(Node head){

        if(head == null || head.next == null) return head; 

        Node zeroeStart = null, zeroEnd = null;
        Node oneStart = null, oneEnd = null;
        Node twoStart = null, twoEnd = null; 
        Node curr = head;

        while(curr!=null){

            if(curr.data == 0){
                if(zeroeStart == null){
                    zeroeStart = curr;
                    zeroEnd = zeroeStart;
                }
                else{
                    zeroEnd.next = curr;
                    zeroEnd = zeroEnd.next;
                }
            }
            else if(curr.data == 1){
                if(oneStart == null){
                    oneStart = curr;
                    oneEnd = oneStart;
                }
                else{
                    oneEnd.next = curr;
                    oneEnd = oneEnd.next;
                }
            }
            else if(curr.data == 2){
                if(twoStart == null){
                    twoStart = curr;
                    twoEnd = twoStart; 
                }
                else{
                    twoEnd.next = curr;
                    twoEnd = twoEnd.next;
                }
            }
            curr = curr.next;
        }

        zeroEnd.next = oneStart;
        oneEnd.next = twoStart;
        twoEnd.next = null; 

        return zeroeStart;

    }

    public static void main(String[] args) {
        
        int[] arr = {1,0,2,1,0,2,1};

        Node head = convertArrayToLL(arr);
        head = sortList(head);
        printLL(head);

    }
}