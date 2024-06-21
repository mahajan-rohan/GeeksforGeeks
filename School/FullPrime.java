/*
Full Prime
Given a number N.Check if it is Full Prime or not. 
Note : A full prime number is one in which the number itself is prime and all its digits are also prime.

Example 1:
Input:
N=31
Output:
0
Explanation:
N is prime but since 1 is not a 
prime so all the digits of N
are not prime.So, Answer is 0.

Example 2:
Input:
N=37
Output:
1
Explanation:
N is prime and so is all of its digits.
Thus, Answer is 1.

Your Task:
You don't need to read input or print anything.Your task is to complete the 
function fullPrime() which takes the number N as input parameter and returns 
1 if the number is Full Prime.Otherwise return 0.

Expected Time Complexity:O(Sqrt(N))
Expected Auxillary Space:O(1)

Constraints:
1<=N<=109
 */

public class FullPrime {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int fullPrime(int N) {
        if (!isPrime(N)) {
            return 0;
        }

        int flag = 0;

        while (N != 0) {
            if (!isPrime(N % 10)) {
                return 0;
            }
            flag = 1;
            N = N / 10;
        }

        if (N == 0 && flag == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
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

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}