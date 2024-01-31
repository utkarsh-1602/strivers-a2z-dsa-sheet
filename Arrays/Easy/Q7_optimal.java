/*
    Name : Move all Zeros to the end of the array

    Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

    Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
    Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
    Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

    Approach : optimal (Two pointers)

    Time Complexity:O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/

 */

public class Q7_optimal {

    
    static int[] allZerosToEnd(int[] arr){

        int n = arr.length;
        int j = -1;

        // placing the j pointer for the element which is 0 
        for(int i = 0; i < n; i++){

            if(arr[i] == 0){
                j = i;
                break;
            }

        }

        // if there are not 0 elements present in the array, just return the array
        if(j == -1) return arr;

        //Move the pointers i and j
        // swap the element which is 0 
        for(int i = j+1; i < n; i++){
            
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }

        return arr;

    }


    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,0,1};
        int[] ans = allZerosToEnd(arr);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }    
}
