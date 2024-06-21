/*
At least two greater elements
Given an array of N distinct elements, the task is to find all elements 
in array except two greatest elements in sorted order.

Example 1:
Input : 
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5 
Explanation :
The output three elements have two or
more greater elements.   

Example 2:
Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4

Your Task:  
You don't need to read input or print anything. Your task is to complete the 
function findElements() which takes the array A[] and its size N as inputs and
return the vector sorted values denoting the elements in array which 
have at-least two greater elements than themselves.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)

Constraints:
3 ≤ N ≤ 105
-106 ≤ Ai ≤ 106
 */

public class LeastTwoGreaterElements {
    static void swap(long[] arr, int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(long[] arr, int low, int high) {
        long pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(long[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public long[] findElements(long a[], long n) {
        long[] ans = new long[(int) n - 2];
        quickSort(a, 0, (int) (n - 1));
        for (int i = 0; i < n - 2; i++) {
            ans[i] = a[i];
        }
        return ans;
    }
}
