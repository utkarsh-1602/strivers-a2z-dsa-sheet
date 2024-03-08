package Maths;

/*
    Name : Print the Fibonacci Sequence 

    Input : n = 6
    output : 0 1 1 2 3 5 8 13 

    Approach : Recursive

    
    Time Complexity:
    Space Complexity: 

 */


// print the fibonacci sequence 

public class Q8_recursive {

    static int fibonacciSequence(int n){

        if(n <= 1){
            return n;
        }
        else{
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
        }

    }

    public static void main(String[] args) {
        
        int n = 7;
        fibonacciSequence(n);

        for(int i = 0; i <= n; i++){
            System.out.print(fibonacciSequence(i) + " ");
        }
        System.out.println();

    }
}
