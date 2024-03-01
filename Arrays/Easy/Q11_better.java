/*
    Name : Find the number that appears once, and the other numbers twice

    Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one..

    Input Format: arr[] = {4,1,2,1,2}
    Result: 4
    Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

    Approach : bruteforce (Gives Runtime Error)

    Time Complexity: O(N)

    Space Complexity: O(N)

    Reference: https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/

 */

public class Q11_better {

    static void numberAppearOnce(int[] arr){

        int n = arr.length;
        int[] countArr = new int[n];

        for(int i = 0; i < n; i++){
            countArr[arr[i]]++;
        }

        for(int i = 0; i < n; i++){
            if(countArr[i] == 1){
                System.out.print(i);
                break;
            }
        }

        System.out.println();
    }
 
    public static void main(String[] args) {
        
        int[] arr = {2,2,1,1,3,5,5,5,7,7,3,9,5,7,7,7,5};
        numberAppearOnce(arr);
        
    }
}
