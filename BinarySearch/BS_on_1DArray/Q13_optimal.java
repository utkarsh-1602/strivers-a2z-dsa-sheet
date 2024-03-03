package BinarySearch.BS_on_1DArray;

/*
    Name : Peak element in Array

    Problem Statement: Given an array of length N. Peak element is defined as the element greater than both of its neighbors. Formally, if ‘arr[i]’ is the peak element, ‘arr[i – 1]’ < ‘arr[i]’ and ‘arr[i + 1]’ < ‘arr[i]’. Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.

    Example 1:
    Input Format: arr[] = {1,2,3,4,5,6,7,8,5,1}
    Result: 7
    Explanation: In this example, there is only 1 peak that is at index 7.

    Example 2:
    Input Format: arr[] = {1,2,1,3,5,6,4}
    Result: 1
    Explanation: In this example, there are 2 peak numbers that are at indices 1 and 5. We can consider any of them.

    Example 3:
    Input Format: arr[] = {1, 2, 3, 4, 5}
    Result: 4
    Explanation: In this example, there is only 1 peak that is at the index 4.

    Example 4:
    Input Format: arr[] = {5, 4, 3, 2, 1}
    Result: 0
    Explanation: In this example, there is only 1 peak that is at the index 0.

    Approach : optimal  

    Time Complexity: O(logN), N = size of the given array.
    Reason: We are basically using binary search to find the minimum.

    Space Complexity: O(1)
    Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).

    Reference: https://takeuforward.org/data-structure/peak-element-in-array/

 */

public class Q13_optimal {

    static int findPeakElement(int[] arr){

        int n = arr.length;

        if(n == 1) return 0;

        if(arr[n-1] > arr[n-2]) return n-1;

        int start = 1;
        int end = n - 2;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1] ){
                return mid;
            }
            else if(arr[mid] > arr[start]){
                start = mid + 1;
            }
            else if(arr[mid] < arr[end]){
                end = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr =  {1,2,3,4,5,6,7,8,5,1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }   
}
