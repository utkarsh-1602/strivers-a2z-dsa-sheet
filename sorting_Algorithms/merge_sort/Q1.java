package sorting_Algorithms.merge_sort;

import java.util.ArrayList;

/*
    Name : Merge Sort Algorithm

    Problem Statement: Given an array of size n, sort the array using Merge Sort.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5

    Approach: 
    Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts. There are 2 main functions :

    merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
    mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where,

    low = leftmost index of the array
    high = rightmost index of the array
    mid = Middle index of the array 

    We recursively split the array, and go from High-to-low until all sub-arrays size becomes 1.

    Time complexity: O(nlogn), At each step, we divide the whole array, for that logn and we assume n steps are taken to get a sorted array, so overall time complexity will be nlogn

    Space Complexity: O(N), Reason: We are using a temporary array to store elements in sorted order

    Reference: https://takeuforward.org/data-structure/merge-sort-algorithm/

 */

public class Q1 {


    static void merge(int[] arr, int low, int mid, int high) {

        // creating temporary array to store left and right half in sorted order 
        ArrayList<Integer> temp = new ArrayList<Integer>(); 

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {

            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }

        }


        // if elements on the left half are still remaining
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still remaining
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary arr to our original array
        for(int i = low; i<= high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    static void mergeSort(int[] arr, int low, int high){

        if(low >= high) return;

        int mid = (low+high)/2;

        mergeSort(arr, low, mid); // left half 
        mergeSort(arr, mid+1, high); // right half
        merge(arr, low, mid, high); // merging sorted halfs
    }

    public static void main(String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};

        int n = arr.length;

        mergeSort(arr, 0, n-1);

        // print the array 
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }      
}

