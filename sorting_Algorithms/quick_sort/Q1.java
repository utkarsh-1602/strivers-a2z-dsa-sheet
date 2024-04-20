package sorting_Algorithms.quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Name : Quick Sort Algorithm

    Problem Statement: Given an array of size n, sort the array using Quick Sort.

    Example 1:
    Input:  N = 5  , Arr[] = {4,1,7,9,3}
    Output: 1 3 4 7 9 

    Explanation: After sorting the array becomes 1, 3, 4, 7, 9

    Example 2:
    Input: N = 8 , Arr[] = {4,6,2,5,7,9,1,3}
    Output: 1 2 3 4 5 6 7 9
    Explanation: After sorting the array becomes 1, 3, 4, 7, 9

    Time Complexity: O(N*logN), where N = size of the array.

        Reason: At each step, we divide the whole array, for that logN and n steps are taken for partition() function, so overall time complexity will be N*logN. 
        
        The following recurrence relation can be written for Quick sort : 
        F(n) = F(k) + F(n-1-k) 

        Here k is the number of elements smaller or equal to the pivot and n-1-k denotes elements greater than the pivot.
        There can be 2 cases :

        Worst Case – This case occurs when the pivot is the greatest or smallest element of the array. If the partition is done and the last element is the pivot, then the worst case would be either in the increasing order of the array or in the decreasing order of the array. 

        Recurrence:
        F(n) = F(0)+F(n-1)  or  F(n) = F(n-1) + F(0) 

        Worst Case Time complexity: O(n2) 

        Best Case – This case occurs when the pivot is the middle element or near to middle element of the array.
        Recurrence :
        F(n) = 2F(n/2)

        Time Complexity for the best and average case: O(N*logN)

    Space Complexity: O(1) + O(N) auxiliary stack space

    Reference: https://takeuforward.org/data-structure/merge-sort-algorithm/

 */

public class Q1{


    static int partition(List<Integer> arr, int low, int high){ 

        int pivot = arr.get(low); 
        int i = low;
        int j = high; 

        while(i < j){
            
            while(arr.get(i) <= pivot && i <= high-1){ 
                i++; 
            }
            while(arr.get(j) > pivot && j >= low+1){ 
                j--; 
            }
            if(i < j){ 
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            } 
        }

        int temp = arr.get(low); 
        arr.set(low, arr.get(j)); 
        arr.set(j, temp);
        return j; 
    }

    static void qs(List<Integer> arr, int low, int high){

        if(low < high){ 
            int pIndex = partition(arr, low, high); 
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high); 
        }
    }


    static List<Integer> quickSort(List<Integer> arr){

        qs(arr, 0, arr.size()-1); 
        return arr; 
    }


    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[]{4, 6, 2, 5, 7, 9, 1, 3}); 

        arr = Q1.quickSort(arr);

        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}