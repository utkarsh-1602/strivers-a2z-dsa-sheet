package medium;
/*
    Name : Rotate Image by 90 degree

    Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

    Input: [[1,2,3]
           ,[4,5,6]
           ,[7,8,9]]

    Output:[[7,4,1]
           ,[8,5,2]
           ,[9,6,3]]

    Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.

    Approach : bruteforce 

    Time Complexity:
    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/rotate-image-by-90-degree/

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Q11_bruteforce {


    static ArrayList<ArrayList<Integer>> rotate90Degrees(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
        matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> answer = rotate90Degrees(matrix, n, m);


    }   
}
