/*
    Name : Reverse Words in a String

    Problem Statement: Given a string s, reverse the words of the string.

    Example 1:
    Input: s=”this is an amazing program”
    Output: “program amazing an is this”

    Approach : bruteforce 
    
    Time Complexity: O(N)
    Space Complexity: O(N), The space is mainly used for the stack, and in the worst case, the stack could have all the words in the string.

    Reference: https://takeuforward.org/data-structure/reverse-words-in-a-string/

 */


package Strings;

import java.util.Stack;

public class Q2_bruteforce {


    static void reverseWordsInString(String s){

        Stack<String> stack = new Stack<String>();
        String str1 = "";

        s += " "; // To get last word while it'll encounter last space


        // adding the words in the stack 
        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == ' ' && !str1.isEmpty()){
                stack.push(str1);
                str1 = "";
            }
            else if(s.charAt(i) != ' '){
                str1 += s.charAt(i);
            }

        }

        // removing it from stack in a LIFO order and storing it in str1 string
        str1 = "";
        while(stack.size() > 0){
            str1 += stack.peek() + " ";
            stack.pop();
        }

        System.out.println(str1);

    }

    public static void main(String[] args) {

        String s = "this is an amazing program";
        reverseWordsInString(s);

    }    
}
