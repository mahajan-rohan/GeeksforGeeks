/*
Simple Interest
Given three integers P,R and T, denoting Principal, Rate of Interest and Time period 
respectively.Compute the simple Interest.

Example 1:
Input:
P=100
R=20
T=2
Output:
40.00
Explanation:
The simple interest on 100 at a rate
of 20% across 2 time periods is 40.

Example 2:
Input:
P=999
R=9
T=9
Output:
809.19
Explanation:
The simple interest on 999 at a rate 
of 9% across 9 time periods is 809.19

Your Task:
You don't need to read input or print anything.Your Task is to complete the 
function simpleInterest() which takes three integers P,R and T and returns the simple interest.

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)

Constraints:
1<=P<=105
1<=R,T<=100
*/

class Simpleinterset
{
public:
    double simpleInterest(int P, int R, int T)
    {
        return (double)(P * R * T) / 100.00;
    }
};