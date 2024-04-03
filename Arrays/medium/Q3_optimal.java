/*
    Name: Find the Majority Element that occurs more than N/2 times.
    
    Problem Statement : Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

    Example 1:
    Input Format: N = 3, nums[] = {3,2,3}
    Result: 3
    Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution. 

    Example 2:
    Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}
    Result: 2
    Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

    Example 3:
    Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}
    Result: 4

    Approach : optimal 

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/find-the-majority-element-that-occurs-more-than-n-2-times/


 */


package medium;

public class Q3_optimal{

    static int occurrence(int[] arr){

        int count = 0;
        int element = -1;

        for(int i=0; i<arr.length; i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }

        //checking if the stored element
        // is the majority element:
        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                count1++;
            }
        }
        
        if(count1 > (arr.length/2)){
            return element;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {10,9,9,9,10};
        int ans = occurrence(arr);

        System.out.println(ans);
    }
}