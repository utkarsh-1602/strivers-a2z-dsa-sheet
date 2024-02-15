package Stack_and_Queues.Learning;

/*
    Name : Implement Stack using Array

    Problem Statement: Implement a stack using an array.

    Approach: As we know stack works on the principle of last in first out, so we have to put elements in an array such that it keeps track of the most recently inserted element. Hence we can think of using a Top variable which will help in keeping track of recent elements inserted in the array.

    Time Complexity: 
    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/implement-stack-using-array/
 */


class stack{

    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }

    int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    int top(){
        return arr[top];
    }

    int size(){
        return top+1;
    }
}

public class Q1 {
    public static void main(String[] args) {
        
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }    
}
