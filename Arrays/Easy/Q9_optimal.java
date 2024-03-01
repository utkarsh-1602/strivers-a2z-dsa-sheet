/*
    Name : Find the missing number in an array

    Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

    Input Format: N = 5, array[] = {1,2,4,5}
    Result: 5
    Explanation: In the given array, number 5 is missing. So,  is the answer.

    Approach : Optmial 

    Time Complexity: O(N)

    Space Complexity:O(1)

    Reference: https://takeuforward.org/arrays/find-the-missing-number-in-an-array/

 */ 

public class Q9_optimal {

    static int missingElement(int[] arr, int N){

        int sum = 0;
    
        int actualSum = (N*(N+1))/2;
        System.out.println(actualSum);

        for(int i=0; i<N-1; i++){
            sum += arr[i];
        }

        int missingNum = actualSum - sum;
        return missingNum;

    }

    public static void main(String[] args) {
        
        int N = 8;
        int[] arr = {1,2,3,5,6,7,8};
        int ans = missingElement(arr, N);
        System.out.println(ans);
    }
}
