/*
Reversing the vowels
Given a string consisting of lowercase english alphabets, reverse only the vowels 
present in it and print the resulting string.

Example 1:
Input:
S = "geeksforgeeks"
Output: geeksforgeeks
Explanation: The vowels are: e, e, o, e, e
Reverse of these is also e, e, o, e, e.

Example 2:
Input: 
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.

Example 3:
Input: 
S = "bcdfg"
Output: bcdfg
Explanation: There are no vowels in S.

Your Task:
You don't need to read input or print anything. Your task is to complete the function modify() 
which takes the string S as input and returns the resultant string by reversing only the vowels present in S.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).
 */

public class ReverseVowel {
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
    }
    String modify(String s) {
        StringBuilder str = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (isVowel(str.charAt(left)) && isVowel(str.charAt(right))) {
                char temp = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, temp);
                left++;
                right--;
            } else {
                if (!isVowel(str.charAt(left))) {
                    left++;
                }
                if (!isVowel(str.charAt(right))) {
                    right--;
                }
            }
        }
        return str.toString();
    }
}
