package Strings;

/*
    Name : Check if two Strings are anagrams of each other
    
    Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

    Input: CAT, ACT
    Output: true
    Explanation: Since the count of every letter of both strings are equal.

    Input: RULES, LESRT 
    Output: false
    Explanation: Since the count of U and T  is not equal in both strings.

    Approach : bruteforce
    
    Time Complexity: O(N)
    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/check-if-two-strings-are-anagrams-of-each-other/

 */

 import java.util.*;
 public class Q6_bruteforce{

   static boolean checkAnagrams(String s1, String s2){

      int n1 = s1.length();
      int n2 = s2.length();

      if(n1!=n2) return false;

      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

      for(char i=0; i<n1; i++){

         if(map.containsKey(s1.charAt(i))){
            map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
         }
         else{
            map.put(s1.charAt(i), 1);
         }

      }

      for(char i=0; i<n2; i++){

         if(map2.containsKey(s2.charAt(i))){
            map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
         }
         else{
            map2.put(s2.charAt(i), 1);
         }

      }

      System.out.println(map);
      System.out.println(map2);

      if(map.equals(map2)){
         return true;
      }
      else{
         return false;
      }

   }

   public static void main(String[] args) {

      String s1 = "CAT";
      String s2 = "ACT";

      System.out.println(checkAnagrams(s1, s2));

    }
 }