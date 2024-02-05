/*
    Name : Reverse Words in a String

    Problem Statement: Given a string s, reverse the words of the string.

    Example 1:
    Input: s=”this is an amazing program”
    Output: “program amazing an is this”

    Approach : optimal 
    
    Time Complexity: O(N), N is length of string
    Space Complexity:  O(1), Constant Space

    Reference: https://takeuforward.org/data-structure/reverse-words-in-a-string/

 */


package Strings;

public class Q2_optimal {


    static void reverseWordsInString(String s){

        int left = 0;
        int right = s.length() - 1;

        String temp = "";
    	String ans = "";

    //Iterate the string and keep on adding to form a word
	//If empty space is encountered then add the current word to the result

        while(left <= right){

            char ch = s.charAt(left);
            
            if(ch != ' '){
                temp += ch;
            }

            else if(ch == ' '){
                if(!ans.equals("")){
                    ans = temp + " " + ans; // here we are reversing the string
                }
                else{
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        //If not empty string then add to the result(Last word is added)
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp + " " + ans; 
            }
            else{
                ans = temp;
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {

        String s = "this is an amazing program";
        reverseWordsInString(s);

    }    
    
}
