package Maths;

/*
    Name : Print the Fibonacci Sequence 

    Input : n = 6
    output : 0 1 1 2 3 5 8 13 

    Approach : Iterative

    
    Time Complexity: O(N)
    Space Complexity: O(1)

 */


// print the fibonacci sequence 

public class Q8_iterative {

    static void fibonacciSequence(int n){

        int i = 0;
        int j = 1;
        int sum = 0;

        System.out.print(i + " " + j + " ");

        for(int k=1;k<n; k++){
            sum = i+j;
            System.out.print(sum + " ");
            i = j;
            j = sum;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int n = 6;
        fibonacciSequence(n);

    }
}
