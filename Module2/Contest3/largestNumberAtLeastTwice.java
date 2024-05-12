/*
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Input Format

First line contains an integer n.

Second line contains an array of integers of size n.

Constraints

2 <= nums.length <= 50

0 <= nums[i] <= 100

The largest element in nums is unique.

Output Format

Return an integer.

Sample Input 0

4
3 6 1 0
Sample Output 0

1
Explanation 0

6 is the largest integer.

For every other number in the array x, 6 is at least twice as big as x.

The index of value 6 is 1, so we return 1.
 */

package java.Module2.Contest3;

import java.util.*;

public class largestNumberAtLeastTwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Output
        System.out.println(largestTwice(nums));
        
    }
    
    public static int largestTwice(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        // Find the maximum number and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        
        // Check if the largest element is at least twice as much as every other number
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > maxNum) {
                return -1;
            }
        }
        
        return maxIndex;
    }
}
