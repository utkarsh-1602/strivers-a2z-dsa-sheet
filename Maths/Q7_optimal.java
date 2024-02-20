package Maths;

/*
    Name : String to Integer (atoi)

    Problem Statement: https://leetcode.com/problems/string-to-integer-atoi/description/

    Example 1:
    Input: s = "   -42"
    Output: -42
    Explanation:
    Step 1: "   -42" (leading whitespace is read and ignored)
                ^
    Step 2: "   -42" ('-' is read, so the result should be negative)
                ^
    Step 3: "   -42" ("42" is read in)
                ^
    The parsed integer is -42.
    Since -42 is in the range [-231, 231 - 1], the final result is -42.

    Example 2:
    Input: s = "4193 with words"
    Output: 4193
    Explanation:
    Step 1: "4193 with words" (no characters read because there is no leading whitespace)
            ^
    Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
            ^
    Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
                ^
    The parsed integer is 4193.
    Since 4193 is in the range [-231, 231 - 1], the final result is 4193.

    Approach : bruteforce

    
    Time Complexity: O(N)
    Space Complexity: O(N)

    Reference: https://leetcode.com/problems/string-to-integer-atoi/description/

 */


public class Q7_optimal{

    static long atoiFunction(String s){

        long result =0;
        long flag = Integer.MAX_VALUE / 10;
        boolean negative = false;
        boolean range = false;
        boolean sign = false;
        boolean digit = false;

        // Using flag instead of directly comparing with Integer.MAX_VALUE allows for better performance. This is because checking against Integer.MAX_VALUE in each iteration of the loop would be less efficient, especially when the string is very long. By using flag, the code only calculates Integer.MAX_VALUE/10 once, reducing the number of computations needed inside the loop.

        first: for(int i=0; i<s.length(); i++){

            if((sign == true) && (s.charAt(i) < '0' || s.charAt(i) > '9')){
                break;
            }
            if((s.charAt(i) < '0' || s.charAt(i) > '9') && (s.charAt(i) != '+' && s.charAt(i) != '-' && s.charAt(i) != ' ')){
                break;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                digit = true;
                if((result > flag) || (result == flag && s.charAt(i) != '7')){

                    // This part of the code is responsible for checking whether appending the next digit to the current result would cause an overflow.

                    // if si is exactly equal to Integer.MAX_VALUE/10, then appending the next digit would cause overflow if the digit is greater than '7'. This is because the maximum value that can be represented in the last digit of a positive integer without causing overflow is 7 (since Integer.MAX_VALUE is 2147483647, and adding 1 more would exceed the limit). 

                    range = true;
                    break;
                }
                result = result*10 + s.charAt(i) - '0';
            }
            else{
                switch(s.charAt(i)){
                    
                    case '-':
                        if(digit == true){
                            break first;
                        }
                        else if(sign == false){
                            sign = true;
                            negative = true;
                        }
                        else{
                            return 0;
                        }
                        break;


                    case '+':
                        if(digit == true){
                            break first;
                        }
                        else if(sign == false){
                            sign = true;
                        }
                        else{
                            return 0;
                        }
                        break;

                    case ' ':
                        if(digit == true){
                            break first;
                        }
                        break; 
                    
                    default:
                        break first;
                }
            }
        }


        if(negative == false && range == false){
            return result;
        }
        else if(negative == false && range == true){
            return Integer.MAX_VALUE;
        }
        else if(negative == true && range == false){
            return result*(-1);
        }
        else{
            return Integer.MIN_VALUE;
        }

    }

    public static void main(String[] args) {
        
        String s = "     -42";
        long ans = atoiFunction(s);
        System.out.println(ans);

    }
}