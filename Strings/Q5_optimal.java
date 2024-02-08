/*
    Name :  Rotate string
    
    Problem Statement: Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s. A shift on s consists of moving the leftmost character of s to the rightmost position.

    Input: s = "abcde", goal = "cdeab"
    Output: true

    Input: s = "abcde", goal = "abced"
    Output: false

    Approach : optimal

    Step1: Check base conditions i.e.:
       if the size of the strings are unequal then return false.

    Step2: Repeat the goal string twice and store it.

    Step3: Check whether the start string is present in it or NOT.

    Step4: If it is present, return True else return False.

    
    Time Complexity: O(1)
    Space Complexity: O(N)

    Reference: https://leetcode.com/problems/rotate-string/description/

 */


package Strings;

public class Q5_optimal {

    static boolean rotateString(String s, String goal){

        int n = s.length();
        int m = goal.length();

        if(n != m) return false;

        StringBuilder sb = new StringBuilder(goal);
        sb.append(goal);

        return (sb.indexOf(s)!=-1);
        /*
        The return statement can be expanded as:
                if(str.indexOf(s)!=-1)
                {
                     return true;
                }
                else
                {
                     return false;
                }
        */   


    }

    public static void main(String[] args) {
        
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));

    }    
}
