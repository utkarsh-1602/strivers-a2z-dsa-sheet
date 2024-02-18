package Maths;

/*
    Name : Count digits in a number

    Problem Statement: Given an integer N, write a program to count the number of digits in N.

    Example 1:
    Input: N = 12345
    Output: 5
    Explanation: N has 5 digits

    Example 2:
    Input: N = 8394
    Output: 4
    Explanation: N has 4 digits

    Approach : bruteforce 
    run a loop for n > 0, divide by 10, and increment count
    
    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/count-digits-in-a-number/

 */

public class Q1_bruteforce{
    public static void main(String[] args) {
        
        int n = 12345;
        // long n = 12323456745L; if the number is long user this 
        int count = 0;

        while(n > 0){
            n /= 10;
            count++;
        }

        System.out.println(count);
    }
}