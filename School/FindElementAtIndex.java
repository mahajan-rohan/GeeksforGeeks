/*
C++ Array (print an element) | Set 2

Given an array arr of n integers and an index key(0-based index).
Your task is to return the element present at the index key in the array.

Example 1:
Input:
n = 5
key = 2
arr = {10, 20, 30, 40, 50}
Output: 30
Explanation: The value of arr[2] is 30

Example 2:
Input:
n = 7
key = 4
arr = {10, 20, 30, 40, 50, 60, 70}
Output: 50
Explanation: The value of the arr[4] is 50 .

Your Task:  
You don't need to read input or print anything. Your task is to complete the 
function findElementAtIndex() which takes integer n , integer key  and an array arr of size n as input parameters and returns the element present at index key.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 106
0 ≤ key ≤ n - 1
1 ≤ arr[i] ≤ 109

 */

public class FindElementAtIndex {
    public static int findElementAtIndex(int n, int key, int[] arr) {
        return arr[key];
    }
}
