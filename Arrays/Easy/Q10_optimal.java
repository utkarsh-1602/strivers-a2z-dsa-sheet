/*
    Name : Count Maximum Consecutive One’s in the array

    Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

    Input: prices = {1, 1, 0, 1, 1, 1}
    Output: 3
    Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.


    Approach : optimal

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/count-maximum-consecutive-ones-in-the-array/

 */ 

public class Q10_optimal {

    static int maxConsecutiveOnes(int[] arr){

        int maxCount = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int ans = maxConsecutiveOnes(arr);
        System.out.println(ans);
    }    
}
