/*
    Name : Move all Zeros to the end of the array

    Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

    Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
    Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
    Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

    Approach : bruteforce 

    Time Complexity: O(N)

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/

 */

public class Q7_bruteforce {


    static void allZerosToEnd(int[] arr){

        int n = arr.length;
        int[] temp = new int[n];

        int j=0;

        for(int i = 0; i < n; i++){

            if(arr[i] == 0){
                continue;
            }
            temp[j] = arr[i];
            j++; 
        }

        while(j < n){
            temp[j] = 0; 
            j++;
        }

        for(int i = 0; i < n; i++){
            System.out.print(temp[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
    
    int[] arr = {1,0,2,3,0,4,0,1};
    allZerosToEnd(arr);

     }   
}
