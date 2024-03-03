package Maths;

/*
    Name : Check if a number is prime or not

    Problem Statement: Given a number, check whether it is prime or not. 
    A prime number is a natural number that is only divisible by 1 and by itself.

    Example 1:
    Input: N = 3
    Output: Prime
    Explanation: 3 is a prime number

    Example 2:
    Input: N = 26
    Output: Non-Prime
    Explanation: 26 is not prime

    Approach : optimal

    Time Complexity:O(sqrt(N))
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/

 */


public class Q6_bruteforce {

    static boolean checkPrime(int n){

         // Edge cases for 0 and 1
         if (n <= 1) {
            return false;
        }

        int root = (int) Math.sqrt(n);

        for(int i=2; i<root; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int n = 11;
        boolean ans = checkPrime(n);

        if(n!=1 && ans==true){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }

    }   
}
