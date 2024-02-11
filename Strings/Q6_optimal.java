/*
    Name : Check if two Strings are anagrams of each other
    
    Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

    Input: CAT, ACT
    Output: true
    Explanation: Since the count of every letter of both strings are equal.

    Input: RULES, LESRT 
    Output: false
    Explanation: Since the count of U and T  is not equal in both strings.

    Approach : optimal
    
    Time Complexity: O(N)

    Space Complexity: O(1), the size of the frequency array is fixed at 26, regardless of the length of the input strings. This is because the array represents the count of occurrences of each letter in the alphabet, and the size of the English alphabet is constant. Therefore, the space complexity contributed by the frequency array remains constant, or O(1).



    Reference: https://takeuforward.org/data-structure/check-if-two-strings-are-anagrams-of-each-other/

 */

package Strings;

public class Q6_optimal {


    static boolean checkAnagrams(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 != n2) return false;

        int[] freq = new int[26];
        // An array freq of size 26 (representing the 26 letters of the alphabet) is initialized with all elements set to 0.


    // We iterate through each character of s1.
    // For each character, we increment the count of its corresponding index in the freq array.
    // Now we will increment the count in frequency array for s1 string, example : For the first character we are doing, 'C' - 'A' = 2, so we increment freq[2]
    // after that we will decrement the count in frequency array for s2 string, example : For the first character we are doing, 'C' - 'A' = 2, so we decrement freq[2] 
        for(int i = 0; i < n1; i++){
            freq[s1.charAt(i) - 'A']++; 
        }

        for(int i=0; i < n2; i++){
            freq[s2.charAt(i) - 'A']--; 
        }

        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "CAT";
        String s2 = "ACT";
    
        System.out.println(checkAnagrams(s1, s2));
    
      }
}
