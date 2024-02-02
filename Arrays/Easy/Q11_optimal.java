/*
    Name : Find the number that appears once, and the other numbers twice

    Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one..

    Input Format: arr[] = {4,1,2,1,2}
    Result: 4
    Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

    Approach : optimal (Using XOR)
    Two important properties of XOR are the following:
    XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
    XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2

    Here all the numbers except the single number appear twice and so will form a pair. Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1. The result will be = 0 ^ (single number) = single number (according to property 2).

    So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number.

    Assume the given array is: [4,1,2,1,2]
    XOR of all elements = 4^1^2^1^2
        = 4 ^ (1^1) ^ (2^2)
        = 4 ^ 0 ^ 0 = 4^0 = 4
    Hence, 4 is the single element in the array.

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/

 */ 


public class Q11_optimal {

    static int numberAppearOnce(int[] arr){

        int n = arr.length;

        // XOR all elements
        int xorr = 0;

        for(int i=0; i<n; i++){
            xorr = xorr ^ arr[i];
        }

        return xorr;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,1,2,1,2};
        int ans = numberAppearOnce(arr);

        System.out.println(ans);
    }
}
