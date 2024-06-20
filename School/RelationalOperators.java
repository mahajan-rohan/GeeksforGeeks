/*
Java Operators(Relational) | Set - 2
Complete the function relationalOperators() that compares two integers a and b. Print:

"a is greater than b" if a is greater than b
"a is less than b" if a is less than b
"a is equal to b" if a equals b
Each output should be followed by a newline character.

Examples :
Input: a = 90 b = 5
Output: 90 is greater than 5.
Explanation: Since a > b So we print 90 is greater than 5.

Input: a = 182 b = 234
Output: 182 is less than 234.
Explanation: Since a < b So we print 182 is less than 234.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1<= a, b <=109
 */

public class RelationalOperators {
    static void relationalOperators(int A, int B) {
        if (A > B)
            System.out.println(A + " is greater than " + B);
        else if (A < B)
            System.out.println(A + " is less than " + B);
        else
            System.out.println(A + " is equal to " + B);
    }
}
