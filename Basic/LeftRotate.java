/*
Rotating an Array
Given an array arr[]. The task is to rotate the array by d elements where d ≤ arr.size.

Examples:
Input: arr[] = [-1, -2, -3, 4, 5, 6, 7], d = 2
Output: [-3, 4, 5, 6, 7, -1, -2]
Explanation: 
Rotate by 1: [-2, -3, 4, 5, 6, 7, -1]
Rotate by 2: [-3, 4, 5, 6, 7, -1, -2]

Input: arr[] = [1, 3, 4, 2], d = 3 
Output: [2, 1, 3, 4]
Explanation: After rotating the array three times, the first three elements shift one by one to the right.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size ≤ 106
-109 ≤ arr[i] ≤ 109
0 ≤ d ≤ arr.size
 */

public class LeftRotate {
    void leftRotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
