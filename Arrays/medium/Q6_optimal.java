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

    Approach : optimal 
 
    Time Complexity: 
    Space Complexity: 

    Reference: https://takeuforward.org/arrays/rearrange-array-elements-by-sign/
 */


package medium;
import java.util.ArrayList;
import java.util.Collections;

public class Q6_optimal{

    static ArrayList<Integer> alternateElements(int[] arr){

        int n = arr.length;

        // here we've defined an arraylist with n size containing all elements with the value of 0, because when we will assign the positive or negative value alternatively at that time we will need to have set the value at a specific index, and for that arraylist should already have the values to be altered. if the arraylist is empty, we won't be able to alter the value at a specific index we need. 
        
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));
        int pos = 0;
        int neg = 1;

        for(int i=0; i<arr.length; i++){

            if(arr[i] < 0){
                list.set(neg, arr[i]);
                neg += 2;
            }
            else{
                list.set(pos, arr[i]);
                pos += 2;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,-4,-5};
        ArrayList<Integer> ans = alternateElements(arr);
        System.out.println(ans);
    }
}