/*
C++ Pointers ( Incrementing a variable) | Set 1
Given a pointer to a variable a, the task is to complete the function 
updateVar() which will increment the value of the variable by 10. 
The function does not returns anything.

Example 1:
Input:
a = 4
Output: 
14

Example 2:
Input:
a = 61
Output: 
71
Your Task:
Since this is a functional problem you don't have to worry about input, 
you just have to complete the function updateVar().

Constraints:
1 <= T <= 100
1 <= A <= 103
*/

void updateVar(int *a)
{
    *a += 10;
}
