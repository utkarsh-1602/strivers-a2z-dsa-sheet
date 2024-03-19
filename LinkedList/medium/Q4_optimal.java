package LinkedList.medium;

/*
    Name : Starting point of loop in a Linked List

    Problem Statement: Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

    Input Format: 
    head = [1,2,3,4,5]
    Result: true

    Input Format: 
    Input: head = [1,2,3,4,5,6]
    Result: false

    Approach: optimal (Tortoise and hare algorithm)

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
 */


public class Q4_optimal{

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


    static Object startOfCycle(Node head){

        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            Node temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return temp.data;
            }
        }

        return null;
    }
    
    
    public static void main(String[] args) {
        
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(3);
        Node six = new Node(6);
        Node seven = new Node(10);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        
        // creating the loop 
        seven.next = third;

        Object result = startOfCycle(head);
        System.out.println(result);

    }
}