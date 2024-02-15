package Stack_and_Queues.Learning;

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
        }

        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currSize++;        
    }
}

public class Q2 {
    
}
