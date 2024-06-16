/*
Print Elements of Array
Given an array arr of size n, print all its elements space-separated.
Note: You don't need to move to the next line after printing all elements of the array (space-separated)

Example 1:
Input:
n = 5
arr[] = {1, 2, 3, 4, 5}
Output: 1 2 3 4 5

Example 2:
Input:
n = 4
arr[] = {2, 3, 5, 5}
Output: 2 3 5 5
Your Task:
Complete the function printArray() which takes an array arr, 
single integer n, as input parameters and prints the value of the array space separated.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106
1 <= arr[i] <= 109
 */

public class PrintArray {
    void printArray(int arr[], int n) {
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
