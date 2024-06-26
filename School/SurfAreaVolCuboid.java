/*
Surface Area and Volume of Cuboid
Given length l, width b and height h of a cuboid. Find the total 
surface area and volume of cuboid.

Example 1:
Input: l = 1, b = 2, h = 3
Output: 22 6
Explanation: Surface area = 2 * (2 * 3
+ 3 * 1 + 1 * 2) = 22 and volume = 
1 * 2 * 3 = 6

Example 2:
Input: l = 2, b = 3, h = 5
Output: 62 30
Explanation: Surface area = 2 * (3 * 5
+ 5 * 2 + 2 * 3) = 62 and volume = 
2 * 3 * 5 = 30

Your Task:
You don't need to read or print anything. Your task is to complete the 
function find() which takes l, b and h as input parameter and returns a 
list containing the value of surface area and volume.

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)

Costraints:
1 <= l, b, h <= 106

 */

public class SurfAreaVolCuboid {
    public long[] find(int l, int b, int h) {
        long[] ans = new long[2];
        long len = l;
        long bd = b;
        long he = h;
        ans[0] = (2 * ((len * bd) + (bd * he) + (he * len)));
        ans[1] = (len * bd * he);
        return ans;

    }
}
