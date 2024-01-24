/*
    Name : Set Matrix Zero

    Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

    Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

    Output: [[1,0,1],[0,0,0],[1,0,1]]

    Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

    Approach : Optimal 

    Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity

    Space Complexity: O(1) as we are not using any extra space.

    Reference: https://takeuforward.org/data-structure/set-matrix-zero/


 */

import java.util.*;
public class Q1_optimal {

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){

        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]
        int col0 = 1;

        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j) == 0){

                    // mark i-th row   
                    matrix.get(i).set(0, 0);

                    // marke j-th column 
                    if(j!=0){
                        matrix.get(0).set(j, 0);
                    }
                    else{
                        col0 = 0;
                    }

                }

            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j) != 0){
                    // check for col and row 
                    if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }


        // Step 3: Finally mark the 1st col & then 1st row
        if(matrix.get(0).get(0) == 0){

            for(int j=0; j<m; j++){
                matrix.get(0).set(j, 0);
            }

        }

        if(col0 == 0){
            for(int i=0; i<n; i++){
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }


    public static void main(String[] args) {
        System.err.println("Hello world!");

        // The code snippet you provided declares an ArrayList named matrix, where each element in the ArrayList is itself an ArrayList of integers
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size(); // number of rows
        int m = matrix.get(0).size(); // number of columns

        ArrayList<ArrayList<Integer>> answer = zeroMatrix(matrix, n, m);

        System.out.println("Final matrix is : ");

        // This is an enhanced for loop that iterates over each row in the answer matrix. For each iteration, the current row is assigned to the variable row, which has the type ArrayList<Integer>.
        // Inside the outer loop, there is another enhanced for loop that iterates over each element (Integer x) in the current row (row).
        for(ArrayList<Integer> row: answer){
            for(Integer x: row){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // So, the nested for loop is responsible for iterating through each element in the 2D ArrayList answer and printing it to the console in a row-by-row fashion. The outer loop iterates through rows, and the inner loop iterates through elements in each row.
    }   
}
