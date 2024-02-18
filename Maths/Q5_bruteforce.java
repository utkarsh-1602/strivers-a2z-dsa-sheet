package Maths;

import java.util.ArrayList;

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

    Approach : bruteforce

    Time Complexity: O(N)
    Space Complexity: O(N) 
    
    The space complexity of the given code is also O(n), where n is the input number. This is because the ArrayList divisors may potentially store all the divisors of the given number, which can be up to O(n) elements in the worst case scenario, for example, when the given number is a prime number.

    Reference: https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/

 */

public class Q5_bruteforce {

    static void printAllDivisors(int n){

        ArrayList<Integer> divisors = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                divisors.add(i);
            }
        }

        System.out.println(divisors);

    }

    public static void main(String[] args) {
        
        int n = 36;
        printAllDivisors(n);

    }   
}
