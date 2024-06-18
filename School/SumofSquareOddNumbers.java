/*
Power of Pow | Odd Numbers

Given a single integer N, your task is to find the sum of the square of the first N odd natural Numbers.
Example 1:
Input: 2
Output: 10
Explanation: 12 + 32 = 10
Example 2: 
Input: 3
Output: 35
Explanation: 12 + 32 + 52 = 35

Your Task:
You don't need to read or print anything. Your task is to complete the 
function sum_of_square_oddNumbers() which takes N as the input parameter 
and returns the sum of the first N odd natural numbers.

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)

Constraints:
1 <= N <= 10000
 */

// This is a brute force approach
public class SumofSquareOddNumbers {
    public long sum_of_square_oddNumbers(long n) {
        long ans = 0;
        for (int i = 1; n != 0; i += 2) {
            if ((i & 1) == 1) {
                ans += Math.pow(i, 2);
                n--;
            }
        }
        return ans;
    }

    // This is the optimized code with Time Complexity: O(1)
    public long sum_of_square_oddNumbers2(long n) {
        return n * (2 * n - 1) * (2 * n + 1) / 3;
    }
}


