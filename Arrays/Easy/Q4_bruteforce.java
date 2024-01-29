/*
    Name : Remove Duplicates in-place from Sorted Array

    Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.


    Input: arr[1,1,1,2,2,3,3,3,3,4,4]

    Output: arr[1,2,3,4,_,_,_,_,_,_,_]

    Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

    Approach : bruteforce (use hashset)

    Time Complexity: O(n*log(n))+O(n) , because we have used hashset and traversed the array one time 

    Space Complexity: O(n)


    Reference: https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/

 */

import java.util.HashSet;

public class Q4_bruteforce {


    static int removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        // size of hashset
        int k = set.size();

        // removing duplicates From the array
        int count = 0;
        for(int x: set){
            arr[count++] = x;
        }

        return k;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,1,2,2,3,3,3,3,4,4};

        int k = removeDuplicates(arr);

        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
