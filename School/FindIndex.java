/*
Find Index
Given an unsorted array arr[] of n integers and a key which is present in this array. 
You need to write a program to find the start index( index where the element is first 
found from left in the array ) and end index( index where the element is first found 
from right in the array ).(0 based indexing is used)
If the key does not exist in the array then return -1 for both start and end index in this case.

Example 1:
Input:
n = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
key = 5
Output:  {4, 5}
Explanation:
5 appears first time at index 4 and appears last time at index 5.
(0 based indexing)

Example 2:
Input:
n = 6
arr = { 6, 5, 4, 3, 1, 2 }
key = 4
Output:  {2, 2} 
Explanation:
4 appears first time and last time at index 2.

Your Task:
You just need to complete the function findIndex() that takes array arr, 
integer n and integer key as parameters and returns an array of length 2 
in which at first index contains the value of start index and at the second 
index contains the value of end index(0 based indexing is used). If the key 
does not exist in the array then return -1 for both start and end index in this case.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 106
1 <= arr[i] , key <= 109 
 */

public class FindIndex {
    static int[] findIndex(int arr[], int n, int key) {
        int[] ans = new int[2];
        int flag1 = 0, flag2 = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (arr[i] == key && flag1 != 1) {
                ans[0] = i;
                flag1 = 1;
            }
            if (arr[j] == key && flag2 != 1) {
                ans[1] = j;
                flag2 = 1;
            }
        }
        if (flag1 == 0 && flag2 == 0)
            return new int[] { -1, -1 };
        return ans;
    }
}
