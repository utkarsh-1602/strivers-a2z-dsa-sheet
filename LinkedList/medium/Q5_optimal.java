package LinkedList.medium;

/*
    Name : Find length of loop in a Linked List

    Problem Statement: Given the head of a linked list, return the length of the loop. If there is no loop, return 0.

    Input Format: 
    head = [1,2,3,4,5], 5 to 3 is loop 
    Result: 3 

    Input Format: 
    Input: head = [1,2,3,4,5,6]
    Result: 0

    Approach: optimal (Tortoise and hare algorithm)

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/
 */


public class Q5_optimal{

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


    static int lengthOfLoop(Node head){

        if(head == null || head.next == null) return 0;

        Node slow = head;
        Node fast = head;
        int count = 0;
        boolean loopExists = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loopExists = true;
                break;
            }
        }

                
        if(loopExists){
            slow = slow.next;
            count = 1;
            while(slow != fast){
                slow = slow.next;
                count++;
            }
        }

        return count;
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

        Object result = lengthOfLoop(head);
        System.out.println(result);

    }
}