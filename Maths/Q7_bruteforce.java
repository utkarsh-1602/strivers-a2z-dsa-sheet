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


public class Q7_bruteforce{

    static int atoiFunction(String s){

        // check base case
        if(s.length() == 0) return 0;

        s = s.trim();

        long result = 0;
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++){

            if(i==0 && ch[i] == '+' || ch[i] == '-'){
                continue;
            }
            else if(ch[i] < '0' || ch[i] > '9') break;
            else{
                if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
                    break;
                }
                result = result*10+ch[i]-'0';
                // If ch[i] is '4', then '4' - '0' evaluates to the integer value 4, because in ASCII encoding, the character '0' has the integer value 48, and character '4' has the integer value 52. Subtracting the ASCII value of '0' from the ASCII value of '4' gives 4.
                // if ch[i] is '2', then ascii 2 is 50, and ascii 0 is 48, so '2' - '0' evaluates to the integer value 2 
            }

        }

        if(ch[0] == '-'){
            result = result * -1;
        }
        if(result > Integer.MAX_VALUE){
			return Integer.MAX_VALUE; 
		}
		else if(result < Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		else {
			return (int) result;
		}

    }

    public static void main(String[] args) {
        
        String s = "     -42";
        int ans = atoiFunction(s);
        System.out.println(ans);

    }
}