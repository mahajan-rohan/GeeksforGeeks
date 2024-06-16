/*
Print 1 to n without using loops
You are given an integer N. Print numbers from 1 to N without the help of loops.

Example 1:
Input:
N = 5
Output:
1 2 3 4 5
Explanation:
We have to print numbers from 1 to 5.

Example 2:
Input:
N = 10
Output:
1 2 3 4 5 6 7 8 9 10
Explanation:
We have to print numbers from 1 to 10.

Your Task:  
You don't need to read input. Your task is to complete the 
function printTillN() which takes an integer N as an input parameter 
and print numbers from 1 to N space-separated integers without the help of loops.
Note: print newline character at the end.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 1000
 */


public class PrintTillN {
    static void printTillN(int N) {
        if (N < 1)
            return;
        printTillN(N - 1);
        System.out.print(N + " ");
    }
}
