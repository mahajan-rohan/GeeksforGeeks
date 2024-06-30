/*
Program to print reciprocal of letters
Given a string S, we need to find reciprocal of it. The reciprocal of the letter is 
found by finding the difference between the position of the letter and the first 
letter ‘A’. Then decreasing the same number of steps from the last letter ‘Z’. 
The character that we reach after above steps is reciprocal.
Reciprocal of Z is A and vice versa because if you reverse the position of the
alphabet A will be in the position of Z.
Similarly, if the letter is a small case then the first letter will be 'a' and
the last letter will be 'z'. and the definition of reciprocal remains the same.

Note: If the character is not a letter its reciprocal will be the same character.

Example 1:
Input:
S = "ab C"
Output:
zy X
Explanation:
The reciprocal of the first letter 'a' is 'z'.
The reciprocal of the second letter 'b' is 'y'.
The reciprocal of the third letter ' ' is ' '.
The reciprocal of the last letter 'C' is 'X'.

Example 2:
Input:
S = "Ish"
Output:
Rhs
Explanation:
The reciprocal of the first letter 'I' is 'R'.
The reciprocal of the second letter 's' is 'h'.
The reciprocal of the third letter 'h' is 's'.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function
reciprocalString() which takes the string S as input parameter and returns the reciprocal string.

Expected Time Complexity: O(|S|) where |S| denotes the length of the string S.
Expected Auxiliary Space: O(|S|)

Constraints:
1 <= |S| <= 104
 */

public class ReciprocalString {
    static String reciprocalString(String S) {
        StringBuilder ans = new StringBuilder(S.length());
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isUpperCase(ch)) {
                ans.append((char) ('Z' - (ch - 'A')));
            } else if (Character.isLowerCase(ch)) {
                ans.append((char) ('z' - (ch - 'a')));
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
