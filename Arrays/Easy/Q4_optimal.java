/*
    Name : Remove Duplicates in-place from Sorted Array

    Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.


    Input: arr[1,1,1,2,2,3,3,3,3,4,4]

    Output: arr[1,2,3,4,_,_,_,_,_,_,_]

    Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

    Approach : Approach (Two Pointers)

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/

 */

public class Q4_optimal {

    static int removeDuplicates(int[] arr){

        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }        

        return i+1;
    }    

    public static void main(String[] args) {

        int arr[] = {1,1,1,2,2,3,3,3,3,4,4};
        int k = removeDuplicates(arr);
        // the updated array : [1, 2, 3, 4, 2, 3, 3, 3, 3, 4, 4]
        // System.out.print(removeDuplicates(arr));

        System.out.print("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
