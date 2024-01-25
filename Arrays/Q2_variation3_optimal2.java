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

    Approach : Optimal 

    Time Complexity

    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/

 */

import java.util.ArrayList;
import java.util.List;

public class Q2_variation3_optimal2 {


    public static List<Integer> generateRow(int row){

        long ans = 1;
        List<Integer> ansRow = new ArrayList<Integer>();

        ansRow.add(1);

        // calculate the rest of the elements
        for(int i=1; i<row; i++){
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n){

        List<List<Integer>> ans = new ArrayList<>();

        // store the entire pascal triangle
        for(int i = 1; i <= n; i++){ 

            ans.add(generateRow(i));

         }
         return ans;
    }

    public static void main(String[] args) {
        
        int n = 5;

        List<List<Integer>> ans = pascalTriangle(n);

        for(List<Integer> x : ans){
            for(int i : x){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }    
}
