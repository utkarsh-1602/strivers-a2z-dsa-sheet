package BinarySearch.BS_on_1DArray;

/*
    Name : Floor and Ceil in Sorted Array

    Problem Statement: You’re given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].

    The floor of x is the largest element in the array which is smaller than or equal to x.
    The ceiling of x is the smallest element in the array greater than or equal to x.

    Example 1:
    Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
    Result: 4 7
    Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

    Example 2:
    Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
    Result: 8 8
    Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.

    Approach : optimal  

    Time Complexity: O(logN), where N = size of the given array.
    Reason: We are basically using the Binary Search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/arrays/floor-and-ceil-in-sorted-array/

 */


public class Q5_optimal {

    static int findFloor(int[] arr, int x){

        int n = arr.length; 
        int start = 0;
        int end = n - 1;

        int floor = -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == x) return arr[mid];

            if(arr[mid] <= x){

                floor = arr[mid];
                start = mid + 1;
            }

            if(arr[mid] > x){
                end = mid - 1;
            }

        }

        return floor; 

    }

    static int findCeil(int[] arr, int x){

        int n = arr.length; 
        int start = 0;
        int end = n - 1;

        int ceil = -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == x) return arr[mid];

            if(arr[mid] < x){

                start = mid + 1;
            }

            if(arr[mid] >= x){
                ceil = arr[mid]; 
                end = mid - 1;
            }

        }

        return ceil; 

    }

    public static void main(String[] args) {
        
        int[] arr = {3, 4, 4, 7, 8, 10}; 
        int x = 5;

        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);

        System.out.println(floor + " " + ceil );
    }   
}
