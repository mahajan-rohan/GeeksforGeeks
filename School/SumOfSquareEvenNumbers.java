/*
Power of Pow | Even Number
Given a single integer N, your task is to find the sum of the square of the first N even natural Numbers.

Example 1:
Input: 2
Output: 20
Explanation: 22 + 42 = 20

Example 2: 
Input: 3
Outptut: 56
Explanation: 22 + 42 + 62 = 56

Your Task:
You don't need to read or print anything. Your task is to complete the function 
sum_of_square_evenNumbers() which takes N as the input parameter 
and returns the sum of the first N even natural numbers.

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)

Constraints:
1 <= N <= 10000
 */

public class SumOfSquareEvenNumbers {
    public long sum_of_square_evenNumbers(long n) {
        return 4 * (n * (n + 1) * (2 * n + 1)) / 6;
    }
}
