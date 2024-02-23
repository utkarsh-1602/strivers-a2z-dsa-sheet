/*
    Name : Rotate array by K elements

    Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

    Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2
    Output: 6 7 1 2 3 4 5
    Explanation: array is rotated to right by 2 position

    Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 
    Output: 9 10 11 3 7 8
    Explanation: Array is rotated to right by 3 position.

    Approach : bruteforce 

    Time Complexity: O(N)

    Space Complexity: O(N)


    Reference: https://takeuforward.org/data-structure/rotate-array-by-k-elements/

 */
public class Q6_bruteforce {

    public static void rotateByKElements(int[] arr, int k){

        int n = arr.length;

        if(n == 0) return;

        k = k % n; 
        // k % n is used to normalize the rotation amount and keep it within the range of the array length, preventing unnecessary full rotations and ensuring that the rotation is performed effectively within the array size.
        // For example, if the array length n is 7 and k is 8, after performing k % n, the effective rotation amount becomes 1 (8 % 7 = 1).
        // This ensures that the rotation is equivalent to rotating by 1 position, which is more efficient than rotating by 8 positions in this case.


        if(k > n) return;

        int[] temp = new int[n]; 
        int breakPoint = n - k; // break point is the index of number from where we will rotate the array

        int j=0;
        for(int i=breakPoint; i<n; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=0; i <= breakPoint-1; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;

        rotateByKElements(arr, k);
    }
}
