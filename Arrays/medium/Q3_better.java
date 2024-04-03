/*
    Name: Find the Majority Element that occurs more than N/2 times.
    
    Problem Statement : Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

    Example 1:
    Input Format: N = 3, nums[] = {3,2,3}
    Result: 3
    Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution. 

    Example 2:
    Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}
    Result: 2
    Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

    Example 3:
    Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}
    Result: 4

    Approach : better (using hashmap)

    Time Complexity: O(2N)
    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/
 */


package medium;

import java.util.HashMap;

public class Q3_better{

    static int occurrence(int[] arr){

        if(arr.length < 0) return -1;

        int n = arr.length;
        int occurrence = n/2;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) > occurrence){
                return arr[i]; 
            }
        }   

        return -1;

    }

    public static void main(String[] args) {
        
        int[] arr = {2,2,3,2,1,2,3};
        int ans = occurrence(arr);

        System.out.println(ans);
    }
}