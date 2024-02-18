package Maths;
/*
    Name : Print all Divisors of a given Number

    Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided.

    Example 1:
    Input: n = 36
    Output: 1 2 3 4 6 9 12 18 36
    Explanation: All the divisors of 36 are printed.

    Example 2:
    Input: n = 97
    Output: 1 97
    Explanation: Since 97 is a prime number, only 1 and 97 are printed.

    Approach : optimal
    This approach is more time efficient than the previous one. But the output sequences are not the same. In the previous approach, we get an ordered output unlike here.

    Time Complexity: O(sqrt(n)), because every time the loop runs only sqrt(n) times.
    Space Complexity: O(1), we are not using any extra space.


    
    Reference: https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/

 */

public class Q5_optimal {

    static void printAllDivisors(int n){

        int root = (int) Math.sqrt(n);

        for(int i = 1; i <= root; i++){

            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i) System.out.print(n/i + " "); // corner case for perfect square (For. example if i=6, then i == n/i, so it will print the same number twice, to avoid that we passing the check i != n/i
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int n = 36;
        printAllDivisors(n);

    }   
}
