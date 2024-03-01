/*
    Name : Find the missing number in an array

    Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

    Input Format: N = 5, array[] = {1,2,3,4,6,7}
    Result: 5
    Explanation: In the given array, number 5 is missing. So, 5 is the answer.

    Approach : better  

    Time Complexity: O(2N), two times traversal of the array

    Space Complexity: O(N)

    Reference: https://takeuforward.org/arrays/find-the-missing-number-in-an-array/

 */

import java.util.Arrays;

public class Q9_better{

    static int missingElement(int[] arr, int N){

        int[] arr2 = new int[N+1]; // 6
        for(int i=0; i<N-1; i++){
            arr2[arr[i]]++;
        }

        System.out.println(Arrays.toString(arr2));

        for(int i=1; i<=N; i++){
            if(arr2[i] == 0){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int N = 7;
        int[] arr = {1,2,3,4,6,7};
        int ans = missingElement(arr, N);
        System.out.println(ans);
    }
}