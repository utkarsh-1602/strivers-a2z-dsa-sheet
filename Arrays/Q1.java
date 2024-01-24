/*
    Name : Set Matrix Zero

    Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

    Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

    Output: [[1,0,1],[0,0,0],[1,0,1]]

    Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

 */

import java.util.*;

public class Q1{

    static ArrayList<ArrayList<Integer>> zeromatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){
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
        for(ArrayList<Integer> row: answer){
            for(Integer x: row){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}