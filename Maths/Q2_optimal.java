package Maths;

/*
    Name : Check if a number is Palindrome or Not

    Problem Statement: Given a number check if it is a palindrome.

    Example 1:
    Input: N = 123
    Output: Not Palindrome Number
    Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

    Example 2:
    Input: N =  121 
    Output: Palindrome Number
    Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.

    Approach : optimal 

    Time Complexity: O(logN) for reversing N digits of input integer.
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not/

 */


public class Q2_optimal {
    
    static void checkPalindrome(int n){

        int res = 0;
        int temp = n;

        while(temp > 0){
            int rem = temp%10;
            res = res*10 + rem; 
            temp /= 10;
        }


        if(res == n){
            System.out.println("PALINDROME NUMBER");
        }
        else{
            System.out.println("NOT PALINDROME NUMBER");
        }
    }
    
    public static void main(String[] args) {
        
        int n = 121;
        checkPalindrome(n);

    }
}
