/*
Display longest name
Given a list of names, display the longest name. If there are multiple names 
of the longest size then return the first occurring name .

Example1 :
Input:
n = 5
names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" }
Output: GeeksforGeeks
Explanation: name "GeeksforGeeks" has maximum length among all names. 

Example2 :
Input:
n = 4
names[] = { "Apple", "Mango", "Orange", "Banana" }
Output: Orange
Explanation: names "Orange" and "Banana" both have maximum length among all 
names but Orange comes first so answer will be "Orange". 

Your Task:  
You don't need to read input or print anything. Your task is to complete the
function longest() which takes the array names[] and its size n as inputs and 
returns the Longest name in the list of names that occurs first.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 1000
1 <= size(names[i]) <= 1000
names[i] has only lowercase and uppercase letters
 */


public class LongestString {
    public static String longest(int n, String[] names) {
        int index=0,large=names[0].length();
        for(int i=0;i<n;i++){
            int temp = names[i].length();
            if(temp>large){
                index=i;
                large=temp;
            }
        }
        return names[index];
    }
}
