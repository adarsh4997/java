/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a String array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.Note that multiple kids can have the greatest number of candies.

Note that multiple kids can have the greatest number of candies.

Input Format

First line of input contains integer N represents size of array.

second line of input contains N integers representing the elements of array.

Third line of input contains integer value of extraCandies.

Constraints

2 <= N <= 100

1 <= candies[i] <= 100

1 <= extraCandies <= 50

Output Format

print the array of strings.

Sample Input 0

5
2 3 5 1 3
3
Sample Output 0

true true true false true
Explanation 0

If you give all extraCandies to:

Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.

Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.

Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.

Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

 */

package java.Module2.Contest1;

import java.util.*;



public class CandyChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for(int i = 0;  i < n; i++){
            candies[i] = sc.nextInt();
        }
        
        int extraCandy = sc.nextInt();
        
        String[] result = new String[n];
        
        // Find the maximum number of candies
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        
        // Check if each kid has greatest number of candies after adding extraCandies
        for(int i = 0;  i < n; i++){
            if (candies[i] + extraCandy >= maxCandies) {
                result[i] = "true";
            } else {
                result[i] = "false";
            }
        }

        
      for(String s : result){
          System.out.print(s+" ");
      }  
    }
}
