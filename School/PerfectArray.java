/*
Perfect Arrays
Given an array arr of size n and you have to tell whether the arr is perfect or not. 
An array is said to be perfect if its reverse array matches the original array. 
If the arr is perfect then return True else return False.

Example 1:
Input :
n = 5
arr = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.So, the answer is PERFECT.

Example 2:
Input :
n = 5
arr = {1, 2, 3, 4, 5}
Output : NOT PERFECT
Explanation:
Here we can see we have [1, 2, 3, 4, 5] if we reverse it we find [5, 4, 3, 2, 1]
which is the not same as before.So, the answer is NOT PERFECT.

User Task:
The task is to complete the function IsPerfect(), which takes an array arr  of size n , 
and returns the boolean value true if it is Perfect else false. The driver will print 
itself "PERFECT" or "NOT PERFECT" accordingly.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ 109
 */

public class PerfectArray {
    public static boolean isPerfect(int n, int[] arr) {
        int[] ans = new int[n];
        for (int i = 0, j = arr.length - 1; j >= 0; i++, j--) {
            ans[i] = arr[j];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans[i])
                continue;
            else
                return false;
        }
        return true;
    }
}
