package Strings;

/*
    Name : . Remove Outermost Parentheses

    Problem Statement: Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

    Input: s = "(()())(())"

    Output: "()()()"

    Explanation: 
    The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
    After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

    Approach : optimal 
    
    Time Complexity:
    Space Complexity: 

    Reference: https://leetcode.com/problems/remove-outermost-parentheses/description/

 */

public class Q1_optimal2 {

    static String removeOutermostParentheses(String s){
        
        int count=0,x=0,y=0;
        String a=null;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='(')
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                y=i;
               a+=s.substring(x+1,y); // (1,5)
               x=i+1; // 6
            }
        }
        a=a.substring(4);
        return a;


    }

    public static void main(String[] args) {
           
        String s = "( ( ) ( ) ) (())(()(()))";
        // count = 0
        // x = 1
        // y = 5 
        // 
        System.out.println(removeOutermostParentheses(s));


    }    
}
