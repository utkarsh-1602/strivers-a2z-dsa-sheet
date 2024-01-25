/*
    Name : Pascal's triangle (calculating the nCr)

    Problem Statement: Given the row number n. Print the n-th row of Pascal’s triangle.

    Input: n=5

    Output: 1 4 6 4 1

    Explanation: Formula for Calculating the nCr is : n! / (r! * (n-r)!)

    Approach : BruteForce 

    Time Complexity:  O(n*r), where n is the given row number, and r is the column index which can vary from 0 to n-1.
    We are calculating the element for each column. Now, there are total n columns, and for each column, the calculation of the element takes O(r) time where r is the column index.

    Space Complexity: O(1) as we are not using any extra space. 

    Reference: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

 */


public class Q2_variation2_bruteforce {
    

    static long nCr(int n, int r){

        long result = 1;

        for(int i=0; i<r; i++){

            result = result * (n - i); // numerator
            result = result / (i + 1); // dividing numerator by denominator
        }

        return result; 

    }

    static void pascalTriangle(int n){

        // printing the entire row n 
        for(int c = 1; c <= n; c++){
            System.out.print(nCr(n-1, c-1) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 5;
        pascalTriangle(n);

    }
}
