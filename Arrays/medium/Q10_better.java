package medium;
/*
    Name : Set Matrix Zero

    Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

    Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

    Output: [[1,0,1],[0,0,0],[1,0,1]]

    Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

    Approach : Better 

    Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
    We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity

    Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.

    Reference: https://takeuforward.org/data-structure/set-matrix-zero/


 */

import java.util.*;

public class Q10_better {

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){

        int[] row = new int[n]; // row array
        int[] col = new int[m]; // column array
        
        // traverse the matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j) == 0){
                    // mark ith index of row wih 1
                    row[i] = 1;

                    // mark jth index of col wih 1
                    col[j] = 1;
                }
            }
        }
        
        // Finally, mark all (i, j) as 0, if row[i] or col[j] is marked with 1.
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    static void printMatrix(ArrayList<ArrayList<Integer>> answer){

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
    

    public static void main(String[] args){

        // The code snippet you provided declares an ArrayList named matrix, where each element in the ArrayList is itself an ArrayList of integers
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size(); // number of rows
        int m = matrix.get(0).size(); // number of columns

        ArrayList<ArrayList<Integer>> answer = zeroMatrix(matrix, n, m);
        System.out.println("Final matrix is : ");
        printMatrix(answer);
    }

}
