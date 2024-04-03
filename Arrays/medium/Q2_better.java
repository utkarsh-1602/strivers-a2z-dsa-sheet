/*
    Name : Sort an array of 0s, 1s and 2s

    Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

    Input: nums = [2,0,1]
    Output: [0,1,2]

    Input: nums = [0]
    Output: [0]

    Approach : Better 

    Time Complexity: O(4N)
    Space Complexity: O(1)


    Reference: https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/
 */


package medium;

import java.util.Arrays;

public class Q2_better {

    static int[] sortingArray(int[] nums){

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] == 0){
                countZero++;
            }
            else if(nums[i] == 1){
                countOne++;
            }
            else if(nums[i] == 2){
                countTwo++;
            }
        }

        int i=0;
        while(countZero > 0){
            nums[i] = 0;
            countZero--;
            i++;
        }

        while(countOne > 0){
            nums[i] = 1;
            countOne--;
            i++;
        }        

    
        while(countTwo > 0){
            nums[i] = 2;
            countTwo--;
            i++;
        }        
    
        return nums;

    }

    public static void main(String[] args) {
        
        int[] arr = {2,0,2,1,1,0};
        int[] result = sortingArray(arr);
        System.out.println(Arrays.toString(result));
    }
    
}
