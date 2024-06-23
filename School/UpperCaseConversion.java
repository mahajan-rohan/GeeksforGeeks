/*
Upper case conversion
Given a string str, convert the first letter of each word in the string to uppercase. 

Example 1:
Input:
str = "i love programming"
Output: "I Love Programming"
Explanation:
'I', 'L', 'P' are the first letters of 
the three words.

Your Task:  
You dont need to read input or print anything. Complete the function transform() 
which takes s as input parameter and returns the transformed string.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N) to store resultant string  

Constraints:
1 <= N <= 104
The original string str only consists of lowercase alphabets and spaces to separate words.
 */


public class UpperCaseConversion {
    public String transform(String s) {
        StringBuilder ans = new StringBuilder(s.length());

        if (s.length() > 0) {
            ans.append(Character.toUpperCase(s.charAt(0)));
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                ans.append(s.charAt(i));
                ans.append(Character.toUpperCase(s.charAt(i + 1)));
                i++;
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
