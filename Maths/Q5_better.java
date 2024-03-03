package Maths;

/*
    Name : Print all Divisors of a given Number

    Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided.

    Example 1:
    Input: n = 36
    Output: 1 2 3 4 6 9 12 18 36
    Explanation: All the divisors of 36 are printed.

    Example 2:
    Input: n = 97
    Output: 1 97
    Explanation: Since 97 is a prime number, only 1 and 97 are printed.

    Approach : better

    Time Complexity: O(N)
    Space Complexity: O(1) 
    
    Reference: https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/

 */

public class Q5_better {

    static void printAllDivisors(int n){

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        int n = 36;
        printAllDivisors(n);

    }   
}
