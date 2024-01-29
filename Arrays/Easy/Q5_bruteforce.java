/*
    Name : Left Rotate the Array by One

    Problem Statement:  Given an array of N integers, left rotate the array by one place

    Input: N = 5, array[] = {1,2,3,4,5}
    
    Output: 2,3,4,5,1

    Explanation: 
    Since all the elements in array will be shifted 
    toward left by one so ‘2’ will now become the 
    first index and and ‘1’ which was present at 
    first index will be shifted at last.

    Approach : bruteforce 

    Time Complexity: O(2N), traversing the array two times

    Space Complexity: O(N), taking a dummy array of same length


    Reference: https://takeuforward.org/data-structure/left-rotate-the-array-by-one/

 */
public class Q5_bruteforce {

    static void leftRotate(int [] arr){
        int n = arr.length;
        int[] arr2 = new int[n];

        for(int i = 0; i < n-1; i++){
            arr2[i] = arr[i+1];
        }

        arr2[n-1] = arr[0];
        for(int i = 0; i < n; i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String args[]) {        
        int[] arr= {1,2,3,4,5};
        leftRotate(arr);
    }   
}
