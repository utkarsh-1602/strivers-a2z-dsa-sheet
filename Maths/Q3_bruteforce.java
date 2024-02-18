package Maths;

/*
    Name : Find GCD of two numbers

    Problem Statement: Find the gcd of two numbers.

    Example 1:
    Input: num1 = 4, num2 = 8
    Output: 4
    Explanation: Since 4 is the greatest number which divides both num1 and num2.

    Example 2:
    Input: num1 = 3, num2 = 6
    Output: 3
    Explanation: Since 3 is the greatest number which divides both num1 and num2.

    Approach : bruteforce 
    check for min(num1,num2) and check that min number  divides by both num1 and num2 or not

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/find-gcd-of-two-numbers/

 */

public class Q3_bruteforce {

    static int findGCD(int num1, int num2) {

        int min = Math.min(num1, num2);
        int ans = 1;

        for(int i=1; i<=min; i++){
            if(num1 % i == 0 && num2 % i == 0){
                ans = i; 
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 8;

        System.out.println(findGCD(num1, num2));

    }
}
