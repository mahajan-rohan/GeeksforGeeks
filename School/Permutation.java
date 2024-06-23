/*
nPr
Write a program to calculate nPr. nPr represents n permutation r and value of 
nPr is (n!) / (n-r)!.

Example 1:
Input: n = 2, r = 1
Output: 2
Explaination: 2!/(2-1)! = 2!/1! = (2*1)/1 = 2.

Example 2:
Input: n = 3, r = 3
Output: 6
Explaination: 3!/(3-3)! = 3!/0! = 6/1 = 6.
Your Task:
You do not need to read input or print anything. Your task is to complete the 
function nPr() which takes n and r as input parameters and returns nPr .

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n, r ≤ 20
 */

public class Permutation {
    static long nPr(long n, long r) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        long fact2 = 1;
        for (int i = 1; i <= n - r; i++) {
            fact2 *= i;
        }
        return fact / fact2;
    }
}
