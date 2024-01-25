/*
    Name : Pascal's triangle (calculating the nCr)

    Problem Statement: Given the row number n. Print the n-th row of Pascal’s triangle.

    Input: n=5

    Output: 1 4 6 4 1

    Explanation: 
    (refer Explaination_screenshots)
    Formula to print nth row: 
    ans = 1
    ans = ans * (row - col) 
    ans = ans / col

    Approach : Optimal 

    Time Complexity: O(N) for n rows 

    Space Complexity: O(1) as we are not using any extra space. 

    Reference: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

 */



public class Q2_variation2_optimal {


    static void pascalTriangle(int n){

        int ans = 1;

        System.out.print(ans + " ");

        for(int i=1; i<n; i++){

            ans = ans * (n - i); // numerator 
            ans = ans / i;  // denominator 
            System.out.print(ans + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        
        int n = 5;
        pascalTriangle(n);

    }    
}
