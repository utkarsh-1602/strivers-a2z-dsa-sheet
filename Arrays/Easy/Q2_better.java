/*
    Name : Find Second Smallest and Second Largest Element in an array

    Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

    Input: arr = {1, 2, 4, 7, 7, 5}

    Output: 
        Second smallest is 2
        Second largest is 5

    Approach : Better
    Find the smallest and largest element in the array in a single traversal
    After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
    Similarly, we would find the largest element which is just smaller than the largest element we just found
    Indeed, this is our second smallest and second largest element.

    Time Complexity: O(2N), as we are traversing the array 2 times

    Space Complexity: O(1)

    Reference: 

 */

 public class Q2_better{

    static void getElements(int[] arr, int n){

        if(n == 0 || n == 1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");

        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        int i;

        for(i = 0; i <n; i++){
            // finding the smallest and largest element in array
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for(i = 0; i <n; i++){

            // finding the secondSmall and secondLarge
            if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
            if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }

        }
        System.out.println(secondSmall);
        System.out.println(secondLarge);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getElements(arr, n);
    
    }
 }