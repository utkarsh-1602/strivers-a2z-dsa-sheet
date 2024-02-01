/*
    Name : Union of Two Sorted Arrays

    Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

    Input:
    n = 5,m = 5.
    arr1[] = {1,2,3,4,5}  
    arr2[] = {2,3,4,4,5}
    Output:
    {1,2,3,4,5}

    Explanation: 
    Common Elements in arr1 and arr2  are:  2,3,4,5
    Distnict Elements in arr1 are : 1
    Distnict Elemennts in arr2 are : No distinct elements.
    Union of arr1 and arr2 is {1,2,3,4,5} 

    Approach : bruteforce

    Time Compleixty : O((m+n)log(m+n)) 
    Inserting an element in a set takes logN time, where N is no of elements in the set. At max set can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. So Inserting m+n th element takes log(m+n) time. Upon approximation across inserting all elements in worst, it would take O((m+n)log(m+n) time.

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/union-of-two-sorted-arrays/

 */

import java.util.HashSet;

public class Q8_better {

    static void unionOfArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);

    }

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {2,3,4,4,5,11,12};

        unionOfArrays(arr1, arr2);

    }    
}
