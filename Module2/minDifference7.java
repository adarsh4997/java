/*
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

Input Format

First line of input contains integer N as size of array.

Second line of contains N integer representing the elenemts of array.

Third line of input contains integer k.

Constraints

1 <= k <= N <= 1000

0 <= nums[i] <= 10^5
Output Format

Return the minimum possible difference

Sample Input 0

4
9 4 1 7
2
Sample Output 0

2
Explanation 0

There are six ways to pick score(s) of two students: - [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.

[9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.

[9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.

[9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.

[9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.

[9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.

The minimum possible difference is 2.
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class minDifference7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Array input
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        //logic
        Arrays.sort(A);
        
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = k-1;
        while(j < n){
            int diff  = A[j]-A[i];
            ans = Math.min(diff, ans);
            i++;
            j++;
        }
        
        System.out.print(ans);
        
    }
}
