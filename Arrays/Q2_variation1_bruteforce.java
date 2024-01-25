/*
    Name : Pascal's triangle (calculating the nCr)

    Problem Statement: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

    Input: r = 5, c = 3 

    Output: 6

    Explanation: 
    
    We can separately calculate n!, r!, (n-r)! and using their values we can calculate nCr. This is an extremely naive way to calculate.
    Formula for Calculating the nCr is : n! / (r! * (n-r)!)
    The element at position (r,c) is: 6

    Approach : BruteForce 

    Time Complexity: O(n)+O(r)+O(n-r).

    Space Complexity: O(1) as we are not using any extra space. 

    Reference: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

 */




public class Q2_variation1_bruteforce {


    static int factorial(int n){

        if(n == 1 || n == 0) return 1;

        else {
            return n * factorial(n-1);
        }
    }


    static int pascalsTriangle(int n, int r){

        int element = factorial(n) / (factorial(r) * factorial(n-r));
        return element;
    }
    
    public static void main(String[] args) {
    
    int r = 5; // row number 
    int c = 3; // column number

    int element = pascalsTriangle(r-1,c-1);
    System.out.println("The element at position (r,c) is: " + element);
 }   
}
