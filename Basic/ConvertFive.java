/*
Replace all 0's with 5
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".

Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".

Your Task:
Your task is to complete the function convertFive() which takes an integer N as 
an argument and replaces all zeros in the number N with 5. Your function should 
return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
 */
public class ConvertFive {
    int convertfive(int num) {
        StringBuilder ans = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '0') {
                ans.setCharAt(i, '5');
            }
        }
        String str = ans.toString();
        int number = Integer.parseInt(str);
        return number;
    }
}
