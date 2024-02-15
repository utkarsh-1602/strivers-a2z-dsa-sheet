package LinkedList;

/*
    Name :  Insert Node at beginning of Linked List

    Problem Statement: For a given Singly LinkedList, insert a node at the beginning of the linked list.

    Example 1:
    Input: List = 10->20->30->40->null, Node = 0
    Output: 0->10->20->30->40->null
    Explanation: Inserted the given node at the beginning of the linked list.

    Example 2:
    Input: List = 100->200->300->null, Node =700
    Output: 700->100->200->300->null
    Explanation: Inserted the given node at the beginning of the linked list.

    Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

    Approach:
    Inserting a Node at the beginning of LinkedList is 3 step Process

    Step 1: First create a node with a value that is to be inserted at the beginning of LinkedList.
    Step 2: Point the next of the newly created Node to the head of the LinkedList.
    Step 3: As the node is inserted at the beginning of LinkedList, this is the first Node in LinkedList. So point the head of the LinkedList to the newly created Node.

 
    Time Complexity: O(1) Because we are just Manipulating the links, which is a constant operation
    Space Complexity: O(1) We are not using any extra space.


    Reference: https://takeuforward.org/data-structure/insert-node-at-beginning-of-linked-list/


 */


class ListNode{

    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next = null; 
    }

}

public class Q3_inserting_node_linkedList {


    static void printList(ListNode head){

        for(; head != null; head = head.next){
            System.out.print(head.val + " -> ");
        }
        System.out.println("null");

    }

    static ListNode insertAtFirst(int value, ListNode head){

        // Step1 : creating a new Node with the given val
        ListNode newnode = new ListNode(value);

        // Step2 : Making next of newly created Node to point the head of LinkedList
        newnode.next = head;

        // Making the newly created Node as head
        head = newnode;
        return head;

    }

    public static void main(String[] args) {
        
        ListNode head = null;  // head of the LinkedList
        head = insertAtFirst(40, head);
        head = insertAtFirst(30, head);
        head = insertAtFirst(50, head);
        head = insertAtFirst(60, head);

        System.out.println("LinkedList before inserting 0 at beginning : ");
        printList(head);

        head = insertAtFirst(0, head);
        System.out.println("LinkedList after inserting 0 at beginning : ");
        printList(head);

    }   
}
