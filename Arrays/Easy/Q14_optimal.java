/*
    Name : Rotate array by K elements

    Problem Statement: Given an array of integers, rotating array of elements by k elements to the left.

    Sample Input 1:
    7 5 2 11 2 43 1 1
    2

    Sample Output 1:
    2 11 2 43 1 1 7 5
    
    Explanation of Sample Input 1:
    Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
    Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
.

    Approach : Optimal 

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/rotate-array-by-k-elements/

 */

import java.util.ArrayList;

public class Q14_optimal {

     public static void swapElements(ArrayList<Integer> arr, int start, int end){

        while(start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        
        int n = arr.size();
        k = k%n;

        swapElements(arr, 0, k-1);
        swapElements(arr, k, n-1);
        swapElements(arr, 0, n-1);

        return arr;
     
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int k = 2;

        arr.add(7);
        arr.add(5);
        arr.add(2);
        arr.add(11);
        arr.add(2);
        arr.add(43);
        arr.add(1);
        arr.add(1);

        ArrayList<Integer> res = new ArrayList<Integer>();
        res = rotateArray(arr, 2);
        
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
    }

}
