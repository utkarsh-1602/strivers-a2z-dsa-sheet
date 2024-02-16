
/*
    Name : Implement Queue Using Array

    Problem Statement: Implement Queue Data Structure using Array with all functions like pop, push, top, size, etc.

    Approach: The intuition is to fill the array in a circular manner, (ie) after popping from the front, rather than moving all the elements towards the front. We can have 2 variables to keep track of the start and end indexes of the sequence. Mod addition is done to handle boundary conditions.

    Time Complexity: 
    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/implement-queue-using-array/
 */

class Queue{

    private int arr[];
    private int start, end, currSize, maxSize;

    public Queue(){
        arr = new int[16];
        start = -1;
        end = 1;
        currSize = 0;
    }

    // put array size into Queue 
    public Queue(int maxSize){  
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public void push(int newElement){

        if(currSize == maxSize){
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }

        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1) % maxSize;
            // Let's break it down:
            // end + 1: This increments the current position of the end pointer by one, effectively moving it to the next position in the array.
            // % maxSize: This performs a modulo operation with maxSize. This ensures that the index wraps around to 0 when it reaches the end of the array, thus implementing the circular behavior.

            // Let's look at an example:
            // Current state: end = 4, maxSize = 5
            // Increment end by 1: end = end + 1 = 4 + 1 = 5
            // Apply modulo operation: end = 5 % 5 = 0
            // So, after the modulo operation, end becomes 0, effectively wrapping around to the beginning of the array.
        }

        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currSize++;        
    }

    public int pop(){

        if(start == -1){
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);

        }

        int popped = arr[start];

        // If there's only one element left in the queue (currSize represents the current size of the queue), it means after this element is popped, the queue will become empty.
        if(currSize == 1){
            start = -1;
            end = -1;
        }

        // In a typical queue implementation, when an element is popped, the start index needs to be moved to the next element in the queue, assuming the queue is not empty
        else{
            start = (start + 1) % maxSize;
            // The % (modulo) operator is used here to ensure that the start index wraps around to the beginning of the array if it reaches the end.
        }
        currSize--;
        return popped; 
    }

    public int top(){

        if(start == -1){
            System.out.println("Queue is Empty");
            System.exit(1);
        }

        return arr[start];
    }

    public int size(){
        return currSize; 
    }
}

public class Q2 {
    public static void main(String[] args) {

        Queue q = new Queue(6);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);


        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());

    }
}
