/*
    Name : Sort an array of 0s, 1s and 2s

    Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

    Input: nums = [2,0,1]
    Output: [0,1,2]

    Input: nums = [0]
    Output: [0]

    Approach : BruteForce 

    Time Complexity: O(3N)

    Space Complexity: O(N)


    Reference: https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/


 */


package medium;

import java.util.Arrays;

public class Q2_bruteforce {

    static void sortingArray(int[] arr){

        int[] temp = new int[arr.length];
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                temp[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        
        int[] arr = {2,0,2,1,1,0};
        sortingArray(arr);

    }
    
}
