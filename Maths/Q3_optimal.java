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

    Approach : optimal (using Euclidean’s theorem)
    // Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.
    gcd(a,b) = gcd(b,a%b)

    Time Complexity:
    Space Complexity:

    Reference: https://takeuforward.org/data-structure/find-gcd-of-two-numbers/

 */


public class Q3_optimal {
 
    static int findGCD(int num1, int num2) {

        if(num2 == 0){
            return num1;
        }        

        return findGCD(num1, num1%num2);

    }

    public static void main(String[] args) {
        
        int num1 = 4;
        int num2 = 8;

        System.out.println(findGCD(num1, num2));

    }
}
