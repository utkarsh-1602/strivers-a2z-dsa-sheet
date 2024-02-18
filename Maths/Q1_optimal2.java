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

    Approach : optimal 
    Use logarithm base 10 to count the number of digits. As
    The number of digits in an integer = the upper bound of log10(n)

    n = 12345
    log10(12345) = 4.091
    Integral part of 4.091 is 4 and 4 + 1 =  5 which is also the number of digits in 12345               

    Time Complexity: O(1)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/count-digits-in-a-number/

 */


public class Q1_optimal2 {

    public static void main(String[] args) {
        
        int n = 12345;
        int digits = (int) Math.floor(Math.log10(n) + 1);
        System.out.println(digits);
    }
}
