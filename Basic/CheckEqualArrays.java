/*
Check Equal Arrays
Given two arrays arr1 and arr2 of equal size, the task is to find whether the 
given arrays are equal. Two arrays are said to be equal if both contain the 
same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be 
the same for two arrays to be equal.

Examples:
Input: arr1[] = [1, 2, 5, 4, 0], arr2[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]

Input: arr1[] = [1, 2, 5], arr2[] = [2, 4, 15]
Output: false
Explanation: arr1[] and arr2[] have only one common value.
Expected Time Complexity: O(n)
Expected Space Complexity: O(n)

Constraints:
1<= arr1.size, arr2.size<=107
1<=arr1[], arr2[]<=109
 */

import java.util.Arrays;

public class CheckEqualArrays {
    public static boolean check(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
