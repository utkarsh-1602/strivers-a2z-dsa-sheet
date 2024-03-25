/*
    Name : Remove N-th node from the end of a Linked List

    Problem Statement: Given a linked list and an integer N, the task is to delete the Nth node from the end of the linked list and print the updated linked list.

    In the case of languages like Java, Python, and Javascript, there is no need for the deletion of objects or nodes because these have an automatic garbage collection mechanism that automatically identifies and reclaims memory that is no longer in use.

    Example 1:
    Input Format: 5->1->2, N=2
    Result: 5->2

    Example 2:
    Input Format: 1->2->3->4->5, N=3
    Result: 1->2->4->5

    Approach: optimal

    Time Complexity: O(2N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/remove-n-th-node-from-the-end-of-a-linked-list/
 */

public class Q8_optimal{

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

     static Node removeNthNode(Node head, int N){

        if(head == null) return null;
        
        Node slow = head;
        Node fast = head;

        
        // Move the fastp pointer N nodes ahead
        for(int i=0; i<N; i++){
            fast = fast.next;
        }

        // If fast becomes null, the Nth node from the end is the head
        if (fast == null) return head.next;

        // Move both pointers until fast reaches the end
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the Nth node from the end
        Node delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;

        return head;
    }
    
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int N = 3;

        Node head = convertArrayToLL(arr);
        head = removeNthNode(head, N);
        printLL(head);

    }
}