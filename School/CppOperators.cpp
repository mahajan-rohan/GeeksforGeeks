/*
C++ Operators | Set 1 (Arithmetic)
Given two numbers A and B. Perform addition,multiplication, subtraction 
and division on these two numbers.

Example 1:
Input: A = 1,  B = 2
Output: 3 2 1 2
Explanation:
A + B = 3
A * B = 2
Since B>A, therefore the result of
subtraction and division are
B - A = 1 and B / A = 2 respectively.

Example 2:
Input: A = 5 B = 7
Output: 12 35 2 1
Explanation:
A + B = 12
A * B=35
Since B>A, therefore results of subtraction
and division are B - A = 2 and B / A = 1.

Your Task:
You don't need to read input or print anything.Your task is to complete the function 
cppOperator() which takes two integers A and B as input parameters and returns a vector 
containing the results of addition,multiplication,subtraction and division of the two numbers.

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)

Constraints:
1 <= A,B <= 10000
*/


/*
#include <bits/stdc++.h>
using namespace std;

class CppOperators
{
public:
    vector<int> cppOperators(int A, int B)
    {
        vector<int> ans;
        ans.push_back((A + B));
        ans.push_back((A * B));
        if (A > B)
        {
            ans.push_back((A - B));
            ans.push_back((A / B));
        }
        else
        {
            ans.push_back((B - A));
            ans.push_back((B / A));
        }
        return ans;
    }
};
*/