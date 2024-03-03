package BinarySearch.BS_on_1DArray;

/*
    Name : Find out how many times the array has been rotated

    Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find how many times the array has been rotated.

    Example 1:
    Input Format: arr = [4,5,6,7,0,1,2,3]
    Result: 4
    Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

    Example 2:
    Input Format: arr = [3,4,5,1,2]
    Result: 3
    Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.

    Approach : bruteforce (gives runtime error)
    (find the index of minimum element) 

    Time Complexity: O(logN), N = size of the given array.
    Reason: We are basically using binary search to find the minimum.

    Space Complexity: O(1)
    Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).

    Reference: https://takeuforward.org/arrays/find-out-how-many-times-the-array-has-been-rotated/

 */


public class Q11_bruteforce {

    static void findRotatedTimes(int[] arr){

        int ans = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                ans = i+1;   
                break;
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2,3};
        findRotatedTimes(arr);
    }
}
