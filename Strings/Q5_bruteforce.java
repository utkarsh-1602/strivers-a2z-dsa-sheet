package Strings;

/*
    Name :  Rotate string
    
    Problem Statement: Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s. A shift on s consists of moving the leftmost character of s to the rightmost position.

    Input: s = "abcde", goal = "cdeab"
    Output: true

    Input: s = "abcde", goal = "abced"
    Output: false

    Approach : bruteforce
    
    Time Complexity: O(N^2)
    Space Complexity: O(N)

    Reference: https://leetcode.com/problems/rotate-string/description/

 */

public class Q5_bruteforce{

    
    static String rotate(String str){

        char[] x = str.toCharArray();
        char temp = x[x.length-1];

        for(int i=x.length-1; i>0; i--){
            x[i] = x[i-1];
        }

        x[0] = temp;
        String res = new String(x);
        System.out.println(x.toString());
        return res;

    }

    static boolean rotateString(String s, String goal){

        if(s.equals(goal)){
            return true;
        }

        String str = s;
        int n = s.length();

        for(int i=0; i<n; i++){

            str = rotate(str);
            if(str.equals(goal)){
                return true;
            }

        }

        return false;
    }


    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));

    }
}