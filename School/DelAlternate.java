/*
Delete alternate characters
Given a string s as input. Delete the characters at odd indices 
of the string. Return the final string after deletion of characters at odd indices.

Examples :
Input: s = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1 and "k" at index 3.
Input: s = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e, k at index 1, 3, 5, 7, 9, 11.

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(|s|)

Constraints:
1<= |s| <=1000
 */

public class DelAlternate {
    static String delAlternate(String S) {
        StringBuilder ans = new StringBuilder(S.length());
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                ans.append(S.charAt(i));
            }
        }
        return ans.toString();
    }
}
