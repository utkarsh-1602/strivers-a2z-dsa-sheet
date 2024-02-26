/*
    Name : Implement stack using linked list

    Problem Statement: Basic knowledge of stack and operations in the linked list.

    But Why to use linked list ? 
    Use linked list for the stack, when the size of the stack is not known in advance.

    Approach: we will use head of linked list as top() of the stack 

    Time Complexity: 
    for adding node in the beginning of the linked list : O(1)
    for removing the first node from the linked list : O(1)

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/implement-stack-using-linked-list/
 */

class Node{
    int data;
    Node next;
    Node(){
        this.data = 0;
        this.next = null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

 public class Q6 {
    
    static class Stack {
        
        Node head;
        int size;

        Stack(){
            this.head = null;
            this.size = 0;
        }

        int getSize(){
            return size;
        }

        boolean isEmpty(){
            return head == null;
        }

        void push(int data){
            Node newNode = new Node(data);
            
            if(isEmpty()){
                head = newNode;
                size++;
            }
            else{
                newNode.next = head;
                head = newNode;
                size++;
            }
        }

        int pop(){
            if(isEmpty()){
                return -1;
            }
            else{
                int poppedElement = head.data;
                head = head.next;
                size--;
                return poppedElement;
            }
        }

        int getTop(){

            if(isEmpty()){
                return -1;
            }
            else{
                return head.data;
            }
        }
        
    }

    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.getTop());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        



    }
}   
