/*
    Name : Largest element in the array

    Problem Statement: Given an array, we have to find the largest element in the array

    Input: arr={2,5,1,3,0}

    Output: 5

    Explanation: The largest element in the array is: 5

    Approach : BruteForce 
    1. sort the array in ascending order
    2. print the last element in the array

    Time Complexity: O(N*log(N)), sort() function takes the time complexity of O(N*log(N)

    Space Complexity: O(1)

    Reference:https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/

 */

import java.util.Arrays;

public class Q1_bruteforce{

    static int largestElement(int[] arr){

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        System.out.println(largestElement(arr));
    }
}
