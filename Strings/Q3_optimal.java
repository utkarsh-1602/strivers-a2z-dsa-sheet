/*
    Name : Largest Odd Number in String

    Problem Statement: You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

    Input: num = "52"
    Output: "5"
    Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
    Example 2:

    Input: num = "4206"
    Output: ""
    Explanation: There are no odd numbers in "4206".
    Example 3:

    Input: num = "35427"
    Output: "35427"
    Explanation: "35427" is already an odd number.

    Approach : optimal 
    
    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://leetcode.com/problems/largest-odd-number-in-string/description/

 */



package Strings;

public class Q3_optimal {


    static String largestOddNumberInString(String s){

        int n = s.length();

        // if the last character is odd then return the string as it is 
        if((int)s.charAt(n-1) % 2 == 1){
            return s; 
        }

        int i = n-1;
        while(i >= 0){
            if(s.charAt(i) % 2 == 1){
                return s.substring(0, i+1);
            }
            i--;
        }

        return "";
    }

    public static void main(String[] args) {
        
        String s = "354276";
        System.out.println(largestOddNumberInString(s));

    }
}
