/*
C++ Operators (Relational) | Set 2
Given two numbers A and B and task is to check whether A is greater than or less than or equals to B.
Example 1:
Input:
A = 2, B = 5
Output:
2 is less than 5
Explanation:
The output is self- 
explanatory.

Example 2:
Input:
A = 6, B = 3
Output:
6 is greater than 3
Explanation:
The output is self- 
explanatory.

Your Task:
You don't need to read input or print anything. Your task is to complete the 
function compareNum() which takes two integers A and B, if

If A > B then print "A is greater than B" without quotes
If A < B then print "A is less than B" without quotes
if A = B then print "A is equals to B" without quotes.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1<=A<=10000
1<=B<=10000
 */

public class ComapreNum {
    static String compareNum(int A, int B) {
        if (A > B)
            return "" + A + " is greater than " + B;
        if (A < B)
            return "" + A + " is less than " + B;
        return "" + A + " is equals to " + B;
    }
}
