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
    convert int to string, and find length of string 

    Time Complexity: O(1)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/count-digits-in-a-number/

 */

public class Q1_optimal1 {
    public static void main(String[] args) {
        
        int n = 12345;

        String x = Integer.toString(n);
        System.out.println(x.length());

    }   
}
