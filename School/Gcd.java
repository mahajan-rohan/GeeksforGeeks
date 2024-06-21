/*
GCD of two numbers
Given two positive integers a and b, find GCD of a and b.
Note: Don't use the inbuilt gcd function

Example 1:
Input: 
a = 3
b = 6
Output: 3
Explanation: GCD of 3 and 6 is 3

Example 2:
Input: 
a = 1
b = 1
Output: 1
Explanation: GCD of 1 and 1 is 1

Your Task:  
You don't need to read input or print anything. Complete the function gcd() 
which takes two positive integers as input parameters and returns 
gcd of a and b as an integer.

Expected Time Complexity: O(log(min(a, b)))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ a, b ≤ 109
 */

public class Gcd {
    public static int gcd(int a, int b) {
        // This code exceeds time limit
        // int gcd = 1;
        // for (int i = 1; i <= a && i <= b; i++) {
        // if (a % i == 0 && b % i == 0)
        // gcd = i;
        // }
        // return gcd;
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

class Solution {

    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int fullPrime(int N) {
        if (!isPrime(N)) {
            return 0;
        }

        int flag = 0;

        while (N != 0) {
            if (!isPrime(N % 10)) {
                return 0;
            }
            flag = 1;
            N = N / 10;
        }

        if (N == 0 && flag == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}