/*
    Name : Check if an Array is Sorted

    Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

    Input: N = 5, array[] = {1,2,3,4,5}

    Output: True

    Approach : Optimal

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/check-if-an-array-is-sorted/

 */


 public class Q3_optimal {

    static boolean isSorted(int[] arr){
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){

            if(arr[i] < arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,3,2,4,5};
        System.out.println(isSorted(arr));

    }
}
