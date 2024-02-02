/*
    Name : Find the missing number in an array

    Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

    Input Format: N = 5, array[] = {1,2,3,4,6,7}
    Result: 3
    Explanation: In the given array, number 3 is missing. So, 3 is the answer.

    Approach : bruteforce  

    Time Complexity: 

    Space Complexity:

    Reference: https://takeuforward.org/arrays/find-the-missing-number-in-an-array/

 */ 

public class Q9_bruteforce {
    
    static int missingElement(int[] arr, int N){

        // Outer loop that runs from 1 to N
        for(int i=1; i<=N; i++){
            // flag variable to check if an element exists
            int flag = 0;

            // search the element using linear search 
            for(int j=0; j<N-1; j++){
                if(arr[j] == i){
                    // element is present
                    flag = 1;
                    break; 
                }
            }

            // check if the element is missing 
            // i.e flag = 0
            if(flag == 0) return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int N = 7;
        int[] arr = {1,2,3,4,6,7};
        int ans = missingElement(arr, N);
        System.out.println(ans);
    }

}
