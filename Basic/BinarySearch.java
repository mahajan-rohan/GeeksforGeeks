/*
Binary Search
Given a sorted array arr and an integer k, find the position(0-based indexing)
at which k is present in the array using binary search.

Examples:
Input: k = 4, arr= [1, 2, 3, 4, 5]  
Output: 3
Explanation: 4 appears at index 3.

Input: k = 445, arr= [11, 22, 33, 44, 55] 
Output: -1
Explanation: 445 is not present.

Expected Time Complexity: O(logn)
Expected Space Complexity: O(long) 

Note: Try to solve this problem in constant space i.e O(1)
 */

public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}
