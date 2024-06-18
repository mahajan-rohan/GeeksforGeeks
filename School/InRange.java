/*
C++ Switch Case Statement
Given a number N, if the number is between 1 and 10 both inclusive then return the 
number in words (Lower case English Alphabets) otherwise return "not in range".

Example 1:
Input:
5
Output:
five

Example 2:
Input:
11
Output:
not in range

Your Task:
You don't need to read input or print anything. Your task is to complete the
function isInRange() which takes an integer and if the number is between 1 and 
10 both inclusive then return the number in words otherwise return "not in range".

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1<=N<=10000
 */

public class InRange {
    static String isInRange(int N) {
        switch (N) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
        }
        return "not in range";
    }
}
