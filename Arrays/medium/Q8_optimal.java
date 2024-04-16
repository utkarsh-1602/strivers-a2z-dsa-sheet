package medium;
/*
    Name : Leaders in an Array
 
    Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.
    
    Example 1:
    Input: arr = [4, 7, 1, 0]
    Output: 7 1 0
    Explanation: Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

    Example 2:
    Input: arr = [10, 22, 12, 3, 0, 6]
    Output: 22 12 6
    Explanation:  6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.


    Approach : bruteforce 

    Time Complexity: O(N)
    Space Complexity: O(N) { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.



    Reference: https://takeuforward.org/data-structure/leaders-in-an-array/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8_optimal{

    public static List<Integer> findLeaders(List<Integer> arr){
        
        int n = arr.size();
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(n == 0) return arr;
        if(n == 1){
            result.add(arr.get(0));
            return result;
        }
        
        result.add(arr.get(n-1)); // last element is always a leader 
        int max = arr.get(n-1);

        for(int i=n-2; i>=0; i--){
            if(arr.get(i) > max){
                result.add(arr.get(i));
                max = arr.get(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(new Integer[] {10, 22, 12, 3, 0, 6});
        List<Integer> result = findLeaders(arr);

        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
        System.out.println();

    }
}