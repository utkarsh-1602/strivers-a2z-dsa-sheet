package BinarySearch.BS_on_1DArray;

/*
    Name : First and Last Occurrences in Array

    Problem Statement: Given a sorted array arr of n integers and a target value k. Write a program to find the indices of the first and the last occurrences of the target value. If the target is not found then return -1 as indices.


    The floor of x is the largest element in the array which is smaller than or equal to x.
    The ceiling of x is the smallest element in the array greater than or equal to x.

    Example 1:
    Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 8
    Result: 3 5
    Explanation: The first occurrence of 8 is at index 3 and the last occurrence is at index 5.

    Example 2:
    Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 10
    Result: -1 -1
    Explanation: The target value is not present in the array. So, we have returned -1 as the indices of the first and the last occurrence.

    Approach : optimal  

    Time Complexity: O(logN), where N = size of the given array.
    Reason: We are basically using the Binary Search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/arrays/first-and-last-occurrences-in-array/

 */


public class Q6_bruteforce {

    static int firstOccurrence(int[] arr, int x){

        int n = arr.length; 
        int start = 0;
        int end = n - 1;
        int firstCount = 0;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == x){
                firstCount = mid;
                end = mid - 1; 
            }

            else if(arr[mid] < x){

                start = mid + 1;
            }

            else if(arr[mid] > x){
                end = mid-1;
            }
        }

        if(firstCount == 0){
            return -1;
        }
        else{
            return firstCount;
        }

    }

    static int lastOccurrence(int[] arr, int x){

        int n = arr.length; 
        int start = 0;
        int end = n - 1;

        int lastCount = 0;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == x){
                lastCount = mid;
                start = mid + 1;

            }

            else if(arr[mid] > x){
                end = mid - 1;
            }

            else if(arr[mid] < x){
                start = mid + 1;
            }

        }

        if(lastCount == 0){
            return -1;
        }
        else{
            return lastCount;
        }


    }

    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13}; 
        int k = 8;

        int firstOccurrence = firstOccurrence(arr, k);
        int lastOccurrence = lastOccurrence(arr, k);

        System.out.println(firstOccurrence + " " + lastOccurrence);

    }   
}
