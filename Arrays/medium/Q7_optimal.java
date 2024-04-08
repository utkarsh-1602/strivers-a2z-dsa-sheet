package medium;
/*
    Name : Next Permutation 

    Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

    Input: arr = [1,2,3]

    Output: [1,3,2]

    Explaination: 

        What is permutation ? 
        permutation is an arrangement of elements in a specific order. Given a set of elements, a permutation is a unique ordering of those elements. For example, if you have the set {1, 2, 3}, the permutations would include {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, and {3, 2, 1}.

        Lexicographically means in dictionary order, so the "next lexicographically greater permutation" is the one that would come next if the permutations were listed in dictionary order.

        Dictionary order, also known as lexicographic order, is an ordering of words or sequences based on the order of their constituent elements. In the context of permutations or strings, it refers to the order that you would find them if you were looking them up in a dictionary.

    Approach : optimal 

        1. find the break point: find the number which is less than i+1, such as arr[i] < arr[i+1]
        2. After finding the break point, try put the number which is greater than i, but the most smallest than other elements 
        3. after you put the number, sort the remaining elements in ascending order 

    Time Complexity: O(3N), where N = size of the given array
    Finding the break-point, finding the next greater element, and reversal at the end takes O(N) for each, where N is the number of elements in the input array. This sums up to 3*O(N) which is approximately O(3N)

    Space Complexity: O(1), as we are not using any extra space to store the elements

    Reference: https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/

 */

import java.util.*;

public class Q7_optimal{

    public static List<Integer> nextGreaterPermutations(List<Integer> arr){

        // size of the array
        int n = arr.size(); // 5

        // Step 1: Find the break point
        int ind = -1; 
        for(int i=n-2; i>=0; i--){
            if(arr.get(i) < arr.get(i+1)){
                ind = i; // 1
                break;
            }
        }

        // if the break point does not exist, it means that the permutation is the greatest permutation
        if(ind == -1){
            // reverse the whole array
            Collections.reverse(arr);
        }


        
        // Step 2: Find the next greater element and swap it with the breakpoint index you've got 
        for(int i=n-1; i>ind; i--){
            if(arr.get(i) > arr.get(ind)){ // 3 > 1
                int temp = arr.get(i); // 3
                arr.set(i, arr.get(ind)); // (index 4, 1)
                arr.set(ind, temp); // (index 1, 3)
                break; // 2 3 5 4 1
            }
        }

        // step 3: Reverse the right half: 
        // try to place the remaining elements in the sorted order 
        List<Integer> sublist = arr.subList(ind+1, n);
        Collections.reverse(sublist);
        // 2 3 1 4 5 

        return arr;
    }

    public static void main(String[] args) {
        
        List<Integer> A = Arrays.asList(new Integer[] {2,1,5,4,3});
        List<Integer> ans = nextGreaterPermutations(A);
        

        System.out.print("The next permutation is: ");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}