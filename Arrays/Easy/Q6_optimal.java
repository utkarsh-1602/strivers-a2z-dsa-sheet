/*
    Name : Rotate array by K elements

    Problem Statement: Given an array of integers, rotating array of elements by k elements to the right.

    Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
    Output: 6 7 1 2 3 4 5
    Explanation: array is rotated to right by 2 position

    Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
    Output: 9 10 11 3 7 8
    Explanation: Array is rotated to right by 3 position.

    Approach : Optimal 

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/rotate-array-by-k-elements/

 */
public class Q6_optimal {

    static void ReverseArray(int[] arr, int start, int end){

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateByKElements(int[] arr, int k){
        int n = arr.length;
        int breakPoint = n-k;

        // Reverse First n-k elements
        ReverseArray(arr, 0, breakPoint-1);

        // Reverse last k elements
        ReverseArray(arr, breakPoint, n-1);

        // Reverse Whole array
        ReverseArray(arr, 0, n-1);


        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {1,3,6,11,12,17};
        int k = 4;
        rotateByKElements(arr, k);
    }
}
