package BinarySearch.BS_on_1DArray;

/*
    Name : Count Occurrences in Sorted Array

    Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

    Example 1:
    Input: N = 7,  X = 3 , array[] = {2, 2 , 3 , 3 , 3 , 3 , 4}
    Output: 4
    Explanation: 3 is occurring 4 times in 
    the given array so it is our answer.

    Example 2:
    Input: N = 8,  X = 2 , array[] = {1, 1, 2, 2, 2, 2, 2, 3}
    Output: 5
    Explanation: 2 is occurring 5 times in the given array so it is our answer.

    Approach : optimal  
    Total no. of occurrences = last occurrence - first occurrence + 1

    Time Complexity:  O(2*logN), where N = size of the given array.
    Reason: We are basically using the binary search algorithm twice.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/data-structure/count-occurrences-in-sorted-array/

 */


public class Q7_optimal {


    static int firstOccurrence(int[] arr, int x){

        int start = 0;
        int end = arr.length - 1;
        int firstCount = 0;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == x){
                firstCount = mid;
                end = mid - 1;
            }

            if(arr[mid] > x){
                end = mid - 1;
            }

            if(arr[mid] < x){
                start = mid + 1;
            }
        }

        return firstCount;
    }


    static int lastOccurrence(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;
        int lastCount = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                lastCount = mid;
                start = mid + 1;
            }
            if(arr[mid] > x){
                end = mid - 1;
            }
            if(arr[mid] < x){
                start = mid + 1;
            }
        }

        return lastCount;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3}; 
        int x = 2;

        int firstOccurrence = firstOccurrence(arr, x);
        int lastOccurrence = lastOccurrence(arr, x);

        int countOccurrences = lastOccurrence - firstOccurrence + 1;
        System.out.println(countOccurrences);
    }   
}
