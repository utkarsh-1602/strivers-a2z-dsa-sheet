/*
    Name : Find Second Smallest and Second Largest Element in an array

    Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

    Input: arr = {1, 2, 4, 7, 7, 5}

    Output: 
        Second smallest is 2
        Second largest is 5

    Approach : Optimal

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/

 */

public class Q2_optimal {

    static int secondSmallest(int[] arr){

        if(arr.length < 2) return -1;

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }


    static int secondLargest(int[] arr){

        if(arr.length < 2)	return -1;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] > large)
            {
                secondLarge = large;
                large = arr[i];
            }

            else if (arr[i] > secondLarge && arr[i] != large)
            {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int sS = secondSmallest(arr);
        int sL = secondLargest(arr);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);
    }
}
