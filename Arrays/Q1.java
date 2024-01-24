/*
    Name : Set Matrix Zero

    Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

    Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

    Output: [[1,0,1],[0,0,0],[1,0,1]]

    Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

 */

import java.util.*;

public class Q1{

    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i){
        
        // set all non-zero elements as -1 in the row i:
        for(int j=0; j<m; j++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
        }

    }

    static void markColumn(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j){

        // set all non-zero elements as -1 in the column j:
        for(int i=0; i<n; i++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
        }
    }


    static ArrayList<ArrayList<Integer>> zeromatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){

        // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix.get(i).get(j) == 0){
                    markRow(matrix, n, m, i);
                    markColumn(matrix, n, m, j);
                }
            }
        }

        // Finally, mark all -1 as 0:
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j) == -1){
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
        
    }

    public static void main(String[] args){
        System.err.println("Hello world!");

        // The code snippet you provided declares an ArrayList named matrix, where each element in the ArrayList is itself an ArrayList of integers
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size(); // number of rows
        int m = matrix.get(0).size(); // number of columns

        ArrayList<ArrayList<Integer>> answer = zeromatrix(matrix, n, m);

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