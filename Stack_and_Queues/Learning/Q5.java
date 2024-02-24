/*
    Name : Implement Queue Using Stack (Two stacks)

    Problem Statement: Given a Stack having some elements stored in it. Can you implement a Queue using the given Stack?

    Approach: using two Stacks where push operation is O(1)

    Time Complexity: O(1)
    Space Complexity: O(2N)

    Reference: https://takeuforward.org/data-structure/implement-queue-using-stack/
 */

import java.util.Stack;

class MyQueue{

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public MyQueue(){

    }

    public void push(int x){
        stack1.push(x);
    }

    public int pop(){

        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        else{
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }


    public int peek(){
        if(!stack2.isEmpty()){
            return stack2.peek();
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }            
            return stack2.peek();
        }
    }

    int size(){
        return stack1.size();
    }
 }

public class Q5 {

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
