/*
Reverse a String
Given a string s , return reverse of the string as output.

Example 1:
Input: 
s = "GeeksforGeeks"
Output: "skeeGrofskeeG" 
Explanation: Reverse string of "GeeksforGeeks" will be "skeeGrofskeeG"

Example 2:
Input: 
s = "ReversE"
Output: "EsreveR"
Explanation: Reverse string of "ReversE" will be "EsreveR"

Your Task:  
You dont need to read input or print anything. Complete the function 
revStr() which takes s as input parameter and returns the reversed string .

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(|s|)

Constraints:
1<= |s| <=106
 */

public class ReverseString {
    static String revStr(String s) {
        StringBuilder rev = new StringBuilder(s.length());

        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
