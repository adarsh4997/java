/*
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.

answer[i] = |leftSum[i] - rightSum[i]|.

Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.

rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.

Return the array answer.

Input Format

First line of input contains integer N which represents size of array.

second line of input contains N integer which represents elements of array.

Constraints

1 <= N <= 1000

1 <= nums[i] <= 10^5

Output Format

Print the answer array.

Sample Input 0

4
10 4 8 3
Sample Output 0

15 1 11 22

 */

package java.Module2.Contest1;
import java.util.*;

public class LeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];        // 10 4 8 3
        for(int i = 0;  i < n; i++){
            nums[i] = sc.nextInt();
        }
 
        //calculate prefix sum
        int[] leftSum = new int[n];
        leftSum[0] = 0;                 //  0 10 14 22
        for(int i = 1; i < n; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        
        //calculate suffix
        int[] rightSum = new int[n];
        rightSum[n-1] = 0;              // 15 11 3 0
        for(int i = n-2; i >= 0; i--){
            rightSum[i] = rightSum[i+1]+nums[i+1];
        }
         
        //ans[i] = | leftSum[i] - rightSum[i] |
        int[] ans = new int[n];             // 15 1 11 22
        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        
        for(int num : ans){
            System.out.print(num+" ");
        }
   
    }
}
