/*
Convert a list of characters into a String
Given a list of characters, merge all of them into a string.

Example 1:
Input:
N = 13
Char array = g e e k s f o r g e e k s
Output: geeksforgeeks 
Explanation: combined all the characters
to form a single string.

Example 2:
Input:
N = 4
Char array = e e b a
Output: eeba
Explanation: combined all the characters
to form a single string.

Your Task:
You dont need to read input or print anything. Complete the function chartostr() 
which accepts a char array arr and its size  N  as parameter and returns a string.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 */

public class CharToStr {
    public String chartostr(char arr[], int N) {
        StringBuilder ans = new StringBuilder(N);
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }
}
