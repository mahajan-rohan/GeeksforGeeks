/*
Print 1 To N Without Loop
Print numbers from 1 to n without the help of loops. 
You only need to complete the function printNos() that 
takes N as parameter and prints number from 1 to N recursively.

Don't print newline, it will be added by the driver code.

Examples
Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10

Input: n = 5
Output: 1 2 3 4 5

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n) (Recursive).

Constraints: 1 <= n <= 1000
 */

public class PrintNos {
    public void printNos(int N) {
        if (N < 1) {
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");
    }
}
