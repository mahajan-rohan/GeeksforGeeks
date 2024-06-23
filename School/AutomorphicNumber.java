
/*
morphic Number
Given a number N, check whether the number is Automorphic number or not.
A number is called Automorphic number if and only if its square ends in 
has the same last digit as the number itself.

Example 1:
Input: N = 76
Output: Automorphic
Explanation: 762 = 5776 which ends with 
6 which was also the last digt in original number therefore it is a automorphic number.

Example 2:
Input: N = 14
Output: Not Automorphic
Explanation: 142 = 196 which ends with 
6 but the last digt in original number is 4 therefore it is not a automorphic number.
Your Task:

You don't need to read or print anything. Your task is to complete the 
function is_AutomorphicNumber() which takes n as input parameter and 
returns "Automorphic" if it is Automorphic number otherwise returns "Not Automorphic"(Without quotes).

Expected Time complexity: O(1)
Expected Space Complexity: O(1)
 */

public class AutomorphicNumber {
    public String is_AutomorphicNumber(int n) {
        int sq = n * n;
        while (n > 0) {
            if (n % 10 != sq % 10) {
                return "Not Automorphic";
            }
            n /= 10;
            sq = sq / 10;
        }
        return "Automorphic";
    }
}
