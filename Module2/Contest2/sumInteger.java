/*
You are given an integer array nums and an integer k. Append k unique positive integers that do not appear in nums to nums such that the resulting total sum is minimum.

Return the sum of the k integers appended to nums.

Input Format

First line contains an integer n.

Second line contains an array of size n.

Third line contains an integer k.

Constraints

1 <= nums.length <= 10^5
    
1 <= nums[i] <= 10^9
    
1 <= k <= 10^8
Output Format

Returns an integer.

Sample Input 0

5
1 4 25 10 25
2
Sample Output 0

5
Explanation 0

The two unique positive integers that do not appear in nums which we append are 2 and 3. The resulting sum of nums is 1 + 4 + 25 + 10 + 25 + 2 + 3 = 70, which is the minimum. The sum of the two integers appended is 2 + 3 = 5, so we return 5.

 */

package java.Module2.Contest2;

import java.util.Arrays;
import java.util.Scanner;

public class sumInteger {
    public static int minSumWithUniqueIntegers(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        
        int sum = 0;
        int missing = 0;
        int current = 1; // Start from 1
        int i = 0;
        while (missing < k) {
            if (i < nums.length && nums[i] == current) {
                i++;
                current++;
            } else {
                sum += current;
                missing++;
                current++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        int result = minSumWithUniqueIntegers(nums, k);
        
        System.out.println(result);
    }
}
