/*
    Name : Check for Balanced Parentheses

    Problem Statement: Check Balanced Parentheses. Given string str containing just the characters ‘(‘, ‘)’, ‘{‘, ‘}’, ‘[‘ and ‘]’, check if the input string is valid and return true if the string is balanced otherwise return false.

    Example 1:
    Input: str = “( )[ { } ( ) ]”
    Output: True

    Explanation: As every open bracket has its corresponding 
    close bracket. Match parentheses are in correct order 
    hence they are balanced.

    Example 2:
    Input: str = “[ ( )”
    Output: False
    Explanation: As ‘[‘ does not have ‘]’ hence it is 
    not valid and will return false.

    Time Complexity: O(N)
    Space Complexity:O(N)

    Reference: https://takeuforward.org/data-structure/check-for-balanced-parentheses/
 */

import java.util.Stack;

public class Q8 {

    static boolean checkForbalancedParentheses(String str){

        if(str.isEmpty()) return false;

        Stack<Character> stack = new Stack<Character>();
        for(char i: str.toCharArray()){
            if(i == '(' || i == '{' || i == '['){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if(ch == '(' && i == ')' || ch == '{' && i == '}' || ch == '[' && i == ']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        
        String s="()[{}()]";
		if(checkForbalancedParentheses(s)==true){
            System.out.println("True");
        }
		else{
            System.out.println("False");
        }
    }   
}
