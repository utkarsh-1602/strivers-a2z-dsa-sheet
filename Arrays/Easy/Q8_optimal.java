/*
    Name : Union of Two Sorted Arrays

    Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

    Input:
    n = 5,m = 5.
    arr1[] = {1,2,3,4,5,6,7,8,9,10};
    arr2[] = {2,3,4,4,5,11,12};
    Output:
    {1,2,3,4,5,6,7,8,9,10,11,12}

    Explanation: 
    Common Elements in arr1 and arr2  are:  2,3,4,5
    Distnict Elements in arr1 are : 1
    Distnict Elemennts in arr2 are : No distinct elements.
    Union of arr1 and arr2 is {1,2,3,4,5} 

    Approach : Optimal

    Time Compleixty : 

    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/union-of-two-sorted-arrays/

 */

import java.util.ArrayList;

public class Q8_optimal {


    static void unionOfArrays(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;

        int i=0, j=0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(i < n && j < m){

            if(arr1[i] <= arr2[j]){

                // we know the array is sorted, so because of that we are checking if the last element in the list is not equal to the current element or not 
                if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                
            }
            else{
                if(list.size() == 0 || list.get(list.size() - 1) != arr2[i]){
                    list.add(arr2[i]);
                }
                j++;
            }
            
        }


        // if any element left in arr 1
        while (i < n) {
            if(list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        // if any element left in arr 2

        while(j < m){
            if(list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }


        System.out.println(list);

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};

        unionOfArrays(arr1, arr2);

    }    

}