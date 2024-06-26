/*
Pattern of Strings
Given a string S of length N, find the pattern of the strings as shown below in the examples.

Example 1:
Input: S = "GeeK"
Output: Geek
        Gee
        Ge
        G
Explanation: Decrease one character 
after each line

Example 2:
Input: S = "G*g" 
Output: G*g
        G*
        G
Explanation: Decrease one character
after each line

Your Task:  
You don't need to read input or print anything. Your task is to complete the function 
pattern() which takes the string S as inputs and returns the answer as a list of strings.

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N2)

Constraints:
1 ≤ N ≤ 103
 */

import java.util.ArrayList;

public class PatternofStrings {
    ArrayList<String> pattern(String S) {
        ArrayList<String> ans = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                temp.append(S.charAt(j));
            }
            ans.add(temp.toString());
            temp.setLength(0);
        }
        return ans;
    }
}
