/*
    Name : Implement Queue Using Stack (Two stacks)

    Problem Statement: Given a Stack having some elements stored in it. Can you implement a Queue using the given Stack?

    Approach: using two Stacks where push operation is O(N)

    TTime Complexity: O(N )  
    Space Complexity: O(2N)

    Reference: https://takeuforward.org/data-structure/implement-queue-using-array/
 */

import java.util.Stack;

class MyQueue{

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public MyQueue(){

    }

    public void push(int x){
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop(){

        if(stack1.isEmpty()){
            System.out.println("Stack is empty");
        }

        return stack1.pop();
    }


    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("Stack is empty");
        }
        return stack1.peek();
    }

    int size(){
        return stack1.size();
    }
 }

public class Q4 {

    public static void main(String[] args) {
     
        MyQueue queue = new MyQueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("The element popped is " + queue.pop());
        System.out.println("The top element is " + queue.peek());
        System.out.println("The size of the queue is " + queue.size());

    }
}
