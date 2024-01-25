/*
    Name : Pascal's triangle (calculating the nCr)

    Problem Statement: Given the number of rows n. Print the first n rows of Pascal’s triangle.

    Input: n=5

    Output: 
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1

    Approach : Bruteforce 

    Time Complexity: O(N^2) as we are using nested loops  

    Space Complexity: O(1) as we are not using any extra space

    Reference: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

 */

public class Q2_variation3_bruteforce {

    static void pascalTriangle(int n){

        int ans = 1;

        System.out.print(ans + " ");

        for(int i=1; i<n; i++){

            ans = ans * (n - i);
            ans = ans / i;

            System.out.print(ans + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int n = 5;
        
        for(int i=0; i<=n; i++){
            pascalTriangle(i);
        }


    }
}
