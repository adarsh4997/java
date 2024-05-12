/*
Samantha is a college student who is struggling to balance her part-time job with her studies. One day, she decided to take a break and went to the nearby park. While sitting on the bench, she overheard a group of students discussing a coding challenge they were trying to solve. Samantha was intrigued and asked them about the challenge.

The challenge was to find the contiguous sub-array with the maximum sum from a given array. Samantha decided to take up the challenge and spent the next few hours working on it. Finally, she was able to come up with a solution that could find the maximum sum sub-array in linear time.

NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . 
Click here -- https://leetcode.com/problems/maximum-subarray/

Input Format

Line 1 : Take input N size of array

Line 2 : Take N input representing array elements

Constraints

1 ≤ N ≤ 10^4

-10^4 ≤ A[i] ≤ 10^4
Output Format

Return max sum of subarray

Sample Input 0

5
-1 2 3 -2 1
Sample Output 0

5
Explanation 0

Max subarray sum is 5 which is {2,3}
 */

package java.Module2;

import java.io.*;
import java.util.*;

public class maxSubArray2 {
    
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        System.out.print(maxSubArray(A));
    }
}
