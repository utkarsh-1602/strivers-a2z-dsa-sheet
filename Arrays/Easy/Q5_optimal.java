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

    Approach : optimal 

    Time Complexity: O(2N), traversing the array two times

    Space Complexity: O(1)


    Reference: https://takeuforward.org/data-structure/left-rotate-the-array-by-one/

 */
public class Q5_optimal {

    static void leftRotate(int [] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i + 1];            
        }
        arr[n-1] = temp;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {        
        int[] arr= {1,2,3,4,5};
        leftRotate(arr);
    }   
}
