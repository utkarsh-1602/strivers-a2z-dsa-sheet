/*
    Name : Largest element in the array

    Problem Statement: Given an array, we have to find the largest element in the array

    Input: arr={2,5,1,3,0}

    Output: 5

    Explanation: The largest element in the array is: 5

    Approach : Optimal
    1. using max variable

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference:https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/

 */
public class Q1_optimal {

    static int largestElement(int[] arr){

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        System.out.println(largestElement(arr));
    }
}
