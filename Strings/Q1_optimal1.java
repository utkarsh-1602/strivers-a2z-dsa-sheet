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
    1. we have set count to 0 and then we are traversing on the basis of specific conditions 
    2. using stringBuilder to store new String 
    3. traverse the array and check for certain conditions: 

        if (count > 0) and character is (, then append it to new string
        and just increment the count, we are using this because if we have an outer opening parenthesis, then its count going to be 0 

        if (count != 1) append character ) 
        and do count--. it means that if our count is 1, then we have an outer closing parenthesis, then we will not append it in new string


    Time Complexity: O(N), The solution iterates over each character in the input string once, so the time complexity is O(n).

    Space Complexity: O(N), The space complexity is also O(n) because the solution uses a StringBuilder to store the result, which can grow up to the size of the input string.

    Reference: https://leetcode.com/problems/remove-outermost-parentheses/description/

 */

public class Q1_optimal1 {

    static String removeOutermostParentheses(String s){
        int count = 0; // 0
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count != 0) {
                    result.append(c);
                }
                count++;
            } else {
                if (count != 1) {
                    result.append(c);
                }
                count--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        String s = "(()())(())(()(()))";
        // ()()()()(())
        System.out.println(removeOutermostParentheses(s));

    }   
}