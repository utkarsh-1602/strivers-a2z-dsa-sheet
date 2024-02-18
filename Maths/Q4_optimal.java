package Maths;

/*
    Name : Check if a number is Armstrong Number or not

    Problem Statement: Given a number, check if it is Armstrong Number or Not

    Example 1:
    Input:153 
    Output: Yes, it is an Armstrong Number
    Explanation: 1^3 + 5^3 + 3^3 = 153

    Input:170 
    Output: No, it is not an Armstrong Number
    Explanation: 1^3 + 7^3 + 0^3 != 170

    Approach : bruteforce

    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/

 */


public class Q4_optimal {
    
    static int countDigits(int num1){
        int count = 0;
        while(num1 > 0){
            count++;
            num1/=10;
        }
        return count;
    }

    static void checkArmstrong(int num1, int n){
        int temp = num1;
        int res = 0;

        while(temp > 0){
            int rem = temp % 10;
            res = (int) (res + Math.pow(rem, n));
            temp/= 10;
        }

        if(res == num1){
            System.out.println("Yes, it is an Armstrong Number");
        } else{
            System.out.println("No, it is not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        
        int num1 = 153;
        int n = countDigits(num1); 
        checkArmstrong(num1, n);

    }
}
