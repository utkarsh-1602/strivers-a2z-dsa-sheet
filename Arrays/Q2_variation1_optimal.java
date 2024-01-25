/*
    Name : Pascal's triangle (calculating the nCr)

    Problem Statement: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

    Input: r = 5, c = 3 

    Output: 6

    Explanation: 

        Formula for Calculating the nCr is : n! / (r! * (n-r)!)

        so if r is 5 and c is 3, then we will do nCr(4C2) it means we will do 
        (4*3*2*1) / (2*1) * (2*1) = 6 

    Approach : BruteForce 

    Time Complexity: O(r)

    Space Complexity: O(1) as we are not using any extra space. 

    Reference: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

 */


public class Q2_variation1_optimal {


    static int nCr(int n, int r){

        int result = 1;

        for(int i=0; i<r; i++){ // the loop will run the size of column times 
            result = result * (n - i); // numerator 
            result = result / (i + 1); // denominator
        }

        return result;
    }

    static int pascalsTriangle(int n, int r){

        int element = nCr(n, r);
        return element; 
    }

    public static void main(String[] args) {
    
        int r = 5; // row number 
        int c = 3; // column number
    
        int element = pascalsTriangle(r-1,c-1);
        System.out.println("The element at position (r,c) is: " + element);
     }   
}
