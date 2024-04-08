/*
    Name : Rearrange Array Elements by Sign

    Problem Statement : There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

    Note: Start the array with positive elements.
        
    Input: arr[] = {1,2,-4,-5}
    Output: 1 -4 2 -5
    Explaination: To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

    Example 2:
    Input: arr[] = {1,2,-3,-1,-2,3}
    Output: 1 -3 2 -1 3 -2
    Explanation: To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3. Also, -3 should come before -1, and -1 should come before -2.

    Approach : bruteforce 
 
    Time Complexity: O(N+N/2) 
    O(N) for traversing the array once for segregating positives and negatives and another. 
    O(N/2) for adding those elements alternatively to the array, where N = size of the array}.

    Space Complexity: O(N/2 + N/2) = O(N) 
    N/2 space required for each of the positive and negative element arrays, where N - size of the array 

    Reference: https://takeuforward.org/arrays/rearrange-array-elements-by-sign/
 */


package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6_bruteforce{

    static int[] alternateElements(int[] arr){
        
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else if(arr[i] < 0){
                neg.add(arr[i]);
            }
        }

        // Positives on even indices, negatives on odd.
        for(int i=0; i<arr.length / 2; i++){
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }

        return arr; 
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,-4,-5};
        int[] ans = alternateElements(arr);

        System.out.println(Arrays.toString(ans));
    }
}