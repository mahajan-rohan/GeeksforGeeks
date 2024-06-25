/*
Extract the integers
Given a string s, extract all the integers from s.

Example 1:
Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation: 
1, 2, 3, 56 are the integers present in s.

Example 2:
Input:
s = "geeksforgeeks"
Output: No Integers
Explanation: 
No integers present in the string.

Your Task:
You don't need to read input or print anything. Complete the function 
extractIntegerWords() which takes string s as input and returns a list 
of strings. If an empty list is returned the output is printed as "No Integers".

Expected Time Complexity: O(|s|).
Expected Auxiliary Space: O(|s|).

Constraints:
1<=|s|<=105
 */

import java.util.ArrayList;

public class ExtractIntegerWords {
    ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> ans = new ArrayList<String>();
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    ans.add(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }
        if (currentNumber.length() > 0) {
            ans.add(currentNumber.toString());
        }

        return ans;
    }
}
